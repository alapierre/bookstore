/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.web;

import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import pl.altkom.bookstore.web.dao.AddressDAO;
import pl.altkom.bookstore.web.dao.ClientDAO;
import pl.altkom.bookstore.web.model.Address;
import pl.altkom.bookstore.web.model.Client;
import pl.altkom.bookstore.web.model.CorporateClient;
import pl.altkom.bookstore.web.model.Person;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
@ContextConfiguration("/bookstore-web-core.xml")
@TransactionConfiguration(defaultRollback = false)
public class TestContext extends AbstractTransactionalJUnit4SpringContextTests{
    
    @Autowired
    private AddressDAO addressDAO;
    
    @Autowired
    private ClientDAO clientDAO;
    
    @Test
    public void test() {
        System.out.println("!!!");
        
        
        Address address = new Address();
        address.setCiti("Rzeszów");
        address.setPostcode("35-000");
        address.setStreet("Łukasiewicza 1234");
        
        addressDAO.save(address);
        
        System.out.println(address.getId());
        
        
    }
    
    @Test
    public void testLoad() {
        
        Address a = addressDAO.findOne(2);
        
        System.out.println(a);
        
        
        
    }
    
    @Test
    public void testClientSave() {
        
        CorporateClient client = new CorporateClient();
        
        Person p = new Person();
        p.setLastName("Kowalski");
        p.setFirstName("Jan");
                
        client.addPerson(p);
        
        client.setName("nazwa klienta");
        
        clientDAO.save(client);
        
    }
    
    @Test
    public void testLoadClient() {
        
        Client c = clientDAO.findOne(3);
        
        if( c instanceof CorporateClient) {
            CorporateClient corpo = (CorporateClient)c;
            System.out.println(corpo.getName());
            
            for(Person p : corpo.getPersons()) {
                System.out.println(p);
            }
            
            
        }
    }
    
    @Test
    public void testFind() {
    
        List<Address> res = addressDAO.findByCiti2("miasto");
        
        System.out.println(res);
    }
    
    
}
