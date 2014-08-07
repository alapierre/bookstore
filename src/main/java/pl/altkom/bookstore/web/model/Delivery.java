/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.bookstore.web.model;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Delivery {

    private Date deliveryTime;
    private String deliveryMethod;
    private DeliveryAddress deliveryAddress;
    private double deliveyCost;

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public double getDeliveyCost() {
        return deliveyCost;
    }

    public void setDeliveyCost(double deliveyCost) {
        this.deliveyCost = deliveyCost;
    }

}
