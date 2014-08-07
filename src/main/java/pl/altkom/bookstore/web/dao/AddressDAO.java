/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.web.dao;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pl.altkom.bookstore.web.model.Address;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public interface AddressDAO extends CrudRepository<Address, Integer> {
    
    public List<Address> findByCiti(String citi);
    
    public List<Address> findByCitiAndStreet(String citi, String street);
    
    @Query("select a from Address a where a.citi = ?")
    public List<Address> findByCiti2(String citi);
    
    
}
