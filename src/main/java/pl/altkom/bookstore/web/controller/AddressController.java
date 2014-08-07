/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import pl.altkom.bookstore.web.dao.AddressDAO;
import pl.altkom.bookstore.web.model.Address;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
@Controller
public class AddressController {
    
    @Autowired
    private AddressDAO addressDAO;
    
    @RequestMapping(value = "/address/{id}", produces = "application/json; charser=utf-8")
    public @ResponseBody Address getAddress(@PathVariable("id") int id) {
        
        Address address = addressDAO.findOne(id);
        
        return address;
        
    }
    
    @RequestMapping(value = "/address/save", method = RequestMethod.POST)
    private @ResponseBody Address saveAddress(Address address) {
        
        System.out.println(address);
        return address;
    }
    
    @RequestMapping("/add-address")
    public ModelAndView displayAddForm() {
        
        ModelAndView model = new ModelAndView("addAddress");
       
        model.addObject("address", new Address());
        
        return model;
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/save-address")
    public String saveForm(@Validated Address address, BindingResult bindingResult) {
        
        if(bindingResult.hasErrors()) {
            return "addAddress";
        } else {
            return "redirect:/home.htm";
        }
        
        
    }
    
}
