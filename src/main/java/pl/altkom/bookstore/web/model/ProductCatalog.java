/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.web.model;

/**
 *
 * @author Daniel Marczydło <your.name at your.org>
 */
public class ProductCatalog {
    
    /**
     * Nazwa kategorii produktow
     */
    private String name;
    /**
     * Ewentualny podatek nadawany na cala kategorie
     */
    private double tax;
    /**
     * Znizka nadawana na cala kategorie w przypadku, gdy chcemy grupowo wprowadzac rabaty
     */
    private double discount; 

    public void setName(String name) {
        this.name = name;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public double getTax() {
        return tax;
    }

    public double getDiscount() {
        return discount;
    }

}
