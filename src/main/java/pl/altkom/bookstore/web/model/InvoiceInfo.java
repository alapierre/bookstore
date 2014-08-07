/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.bookstore.web.model;

/**
 * Describes invoice informations required for generating Invoice
 *
 * @see pl.altkom.bookstore.model.Invoice
 *
 * @author Radek Kozak
 */
public class InvoiceInfo {

    private String name;
    private String taxId;

    public InvoiceInfo() {
    }

    public InvoiceInfo(String name, String taxId) {
        this.name = name;
        this.taxId = taxId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

}
