/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.web.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Piotr Wajcowicz
 */
@Entity
public class Invoice {
    /**
     * Invoice number
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int invoceId;
    
    /**
     * Invoice date
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date invoiceDate;
    
    /**
     * Worker information
     */
    @ManyToOne
    @JoinColumn(name = "worker_id")
    private Person worker;
    
    /**
     * Client information 
     */
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Person client;
    
    /**
     * List of ordered products
     */
    @OneToMany(mappedBy = "invoice")
    private List<DocItem> orderedProducts = new ArrayList<>();
    
    public int getInvoceId() {
        return invoceId;
    }

    public void setInvoceId(int invoceId) {
        this.invoceId = invoceId;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Person getWorker() {
        return worker;
    }

    public void setWorker(Person worker) {
        this.worker = worker;
    }

    public Person getClient() {
        return client;
    }

    public void setClient(Person client) {
        this.client = client;
    }

    public List<DocItem> getOrderedProducts() {
        return orderedProducts;
    }

    public void setOrderedProducts(List<DocItem> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }
    
    
    
}
