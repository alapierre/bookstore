/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.altkom.bookstore.web.model.Address;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
@Controller
public class AddressController {
    
    @RequestMapping(value = "/address", produces = "application/json; charser=utf-8")
    public @ResponseBody Address getAddress() {
        
        Address address = new Address();
        address.setCiti("Rzeszów");
        address.setPostcode("35-000");
        address.setStreet("Łukasiewicza 1234");
        
        return address;
        
    }
    
}
