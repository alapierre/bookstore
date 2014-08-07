/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.web.dao;

import org.springframework.data.repository.CrudRepository;
import pl.altkom.bookstore.web.model.Address;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public interface AddressDAO extends CrudRepository<Address, Integer> {
    
}
