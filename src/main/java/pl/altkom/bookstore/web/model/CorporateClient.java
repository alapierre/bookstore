/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.web.model;

import java.util.HashMap;
import java.util.Map;
/**
 * Describes corporate client
 * @author Radek Kozak
 */
public class CorporateClient extends Client {

    private String name;
    private String vatId;

    private Map<String, Person> persons;

    public void addPerson(Person p) {

        String pesel = p.getPeselNumber();

        if(!persons.containsKey(pesel)) {
            persons.put(pesel, p);
        }
    }

    public CorporateClient() {
        setType(ClientType.CORPORATE);
        this.persons = new HashMap<>();
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
        return persons.get(pesel);
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
