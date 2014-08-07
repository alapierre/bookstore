/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.bookstore.web.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Daniel Marczydło <your.name at your.org>
 */
public class Warehouse {

    private Map<Product, WarehouseState> items = new HashMap<>();

    /**
     * Numer magazynu na ktorym znajduje sie dany produkt (umozliwia posiadanie
     * wielu magazynow)
     */
    private int numberWarehouse;

    /**
     * Ewentualna osoba kontaktowa dla magazynu (Pan Mgr)
     */
    private Kontakt contactPerson;

    public void addProduct(Product product, int volumne) {

        WarehouseState tmp = items.get(product);

        if (tmp == null) {
            items.put(product, new WarehouseState(product, volumne));
        } else {
            tmp.setVolume(tmp.getVolume() + volumne);
        }

    }

    public void setContactPerson(Kontakt contactPerson) {
        this.contactPerson = contactPerson;
    }

    public Kontakt getContactPerson() {
        return contactPerson;
    }

    public void setNumberWarehouse(int numberWarehouse) {
        this.numberWarehouse = numberWarehouse;
    }

    public int getNumberWarehouse() {
        return numberWarehouse;
    }

}
