/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Piotr Wajcowicz
 */
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    public Product() {
    }

    public Product(int productId, String productName, double productPrice, 
                   double productVat, String productUnit) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productVat = productVat;
        this.productUnit = productUnit;
    }
    
    /**
     * Product unique ID
     */
    private int productId;
    
    /**
     * Name of product
     */
    private String productName;
    
    /**
     * Product manyufactuer price
     */
    private double productPrice;
    
    /**
     * Discount number
     */
    private double discount;
    
    /**
     * Name of the manufacturer
     */
    private String productManufacturer;
    
    /**
     * Vat rate 
     */
    private double productVat;
    
    /**
     * Unit metrics
     */
    private String productUnit;

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    public double getProductVat() {
        return productVat;
    }

    public void setProductVat(double productVat) {
        this.productVat = productVat;
    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice + ", discount=" + discount + ", productManufacturer=" + productManufacturer + ", productVat=" + productVat + ", productUnit=" + productUnit + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.productId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        return this.productId == other.productId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
