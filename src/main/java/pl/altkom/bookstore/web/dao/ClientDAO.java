/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.web.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import pl.altkom.bookstore.web.model.Client;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public interface ClientDAO extends CrudRepository<Client, Integer> {
    
    //public List<Client> findByName(String name);
    
}
