/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor - test.
 */
package pl.altkom.bookstore.web.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Trader VO
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
@Entity
public class Person implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String firstName;

    private String lastName;

    private String peselNumber;

    private Date dateOfBirth;

    private Kontakt contact;

    private Address address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPeselNumber() {
        return peselNumber;
    }

    public void setPeselNumber(String peselNumber) {
        if (peselNumber.matches("[0-9]+") && (peselNumber.length() == 11)) {
            this.peselNumber = peselNumber;
        } else {
            throw new IllegalArgumentException("Pesel must be 11 digit number");
        }
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Kontakt getContact() {
        return contact;
    }

    public void setContact(Kontakt contact) {
        this.contact = contact;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
