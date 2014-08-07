/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.web.model;

import java.io.Serializable;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Describes Client
 *
 * @author Radek Kozak
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "client_type")
public abstract class Client implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    
    //private ClientType type;

    /**
     * All info required for generating invoice
     *
     * @return InvoiceInfo
     * @see pl.altkom.bookstore.model.InvoiceInfo
     */
    public abstract InvoiceInfo getInvoiceInfo();

    public abstract String getClientId();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
