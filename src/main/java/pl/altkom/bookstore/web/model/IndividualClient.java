/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.web.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Describes individual client
 *
 * @author Radek Kozak
 */
@Entity
@DiscriminatorValue("individual")
public class IndividualClient extends Client {

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public IndividualClient() {
    }

    public IndividualClient(Person person) {
        this.person = person;
        //setType(ClientType.INDIVIDUAL);
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public InvoiceInfo getInvoiceInfo() {
        return new InvoiceInfo(person.getFirstName()
                + " "
                + person.getLastName(),
                String.valueOf(person.getPeselNumber()));
    }

    @Override
    public String getClientId() {
        return person.getPeselNumber();
    }

    @Override
    public String toString() {
        return person.getFirstName() + " " + person.getLastName() + " with pesel : " + person.getPeselNumber();
    }
}
