/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.web.model;

import java.io.Serializable;

/**
 * Describes Client
 *
 * @author Radek Kozak
 */
public abstract class Client implements Serializable {

    private ClientType type;

    public ClientType getType() {
        return type;
    }

    public void setType(ClientType type) {
        this.type = type;
    }

    /**
     * All info required for generating invoice
     *
     * @return InvoiceInfo
     * @see pl.altkom.bookstore.model.InvoiceInfo
     */
    public abstract InvoiceInfo getInvoiceInfo();

    public abstract String getClientId();

}
