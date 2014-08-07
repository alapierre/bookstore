/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.web.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
/**
 * Describes corporate client
 * @author Radek Kozak
 */
@Entity
@DiscriminatorValue("corporate")
public class CorporateClient extends Client {
    
    private String name;
    private String vatId;

    @OneToMany
    private List<Person> persons = new ArrayList<>();

    public void addPerson(Person p) {

        persons.add(p);
    }

    public CorporateClient() {
        //setType(ClientType.CORPORATE);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVatId() {
        return vatId;
    }

    public void setVatId(String vatId) {
        this.vatId = vatId;
    }


    /**
     * Search for given person by the pesel number
     *
     * @param pesel Pesel number
     *
     * @see pl.altkom.bookstore.model.Person
     * @return Person
     */
    public Person getPersonByPesel(String pesel) {
        
        for(Person p : persons) {
            if(p.getPeselNumber().equals(pesel)) return p;
        }
        
        return null;
    }


    @Override
    public InvoiceInfo getInvoiceInfo() {
        return new InvoiceInfo(name, vatId);
    }

    @Override
    public String getClientId() {
        return getVatId();
    }

    @Override
    public String toString() {
        return getName() + " with VAT ID: " + getVatId();
    }
}
