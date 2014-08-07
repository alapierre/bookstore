/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.bookstore.web.model;

import java.time.Clock;
import java.time.Period;

/**
 *
 * @author Administrator
 */
public class DeliveryMethod {

    private String deliveryType;
    private Period deliveryTime;
    private String insuranceType;
    private double insuranceCost;
    private Clock deliveryHour;

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Period getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Period deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Clock getDeliveryHour() {
        return deliveryHour;
    }

    public void setDeliveryHour(Clock deliveryHour) {
        this.deliveryHour = deliveryHour;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public double getInsuranceCost() {
        return insuranceCost;
    }

    public void setInsuranceCost(double insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

}
