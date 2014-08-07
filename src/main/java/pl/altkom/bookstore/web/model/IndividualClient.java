/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.web.model;

/**
 * Describes individual client
 *
 * @author Radek Kozak
 */
public class IndividualClient extends Client {

    private Person person;

    public IndividualClient(Person person) {
        this.person = person;
        setType(ClientType.INDIVIDUAL);
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
