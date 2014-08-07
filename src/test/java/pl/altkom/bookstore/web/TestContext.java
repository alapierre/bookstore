/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.web;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import pl.altkom.bookstore.web.dao.AddressDAO;
import pl.altkom.bookstore.web.model.Address;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
@ContextConfiguration("/bookstore-web-core.xml")
@TransactionConfiguration(defaultRollback = false)
public class TestContext extends AbstractTransactionalJUnit4SpringContextTests{
    
    @Autowired
    private AddressDAO addressDAO;
    
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
    
}
