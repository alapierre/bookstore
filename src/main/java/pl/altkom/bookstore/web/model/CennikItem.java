/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.web.model;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class CennikItem {
    
    private Product product;
    private double price;

    public CennikItem() {
    }

    public CennikItem(Product product, double price) {
        this.product = product;
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CennikItem{" + "product=" + product + ", price=" + price + '}';
    }
    
}
