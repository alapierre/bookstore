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
public class WarehouseState {

    /**
     * Obiekt produktu na stanie magazynowym
     */
    private Product product;

    private double volume;

    public WarehouseState(Product product, double volume) {
        this.product = product;
        this.volume = volume;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

}
