/*
 * Copyright 2011-08-31 the original author or authors.
 */
package pl.altkom.bookstore.web.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Adrian Lapierre <adrian@softproject.com.pl>
 */
@Controller
public class MyController {
    
    protected Logger logger = Logger.getLogger(getClass());
    
    @RequestMapping("/home")
    public ModelAndView home(@RequestParam String name) {
        
        logger.debug("MyController.home()");
        
        //String name = "Alicja";
        
        ModelAndView model = new ModelAndView("home");
        model.addObject("name", name);
        
        return model;
    }
    
}
