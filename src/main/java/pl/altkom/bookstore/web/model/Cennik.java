/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.web.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Marcin Kępa <your.name at your.org>
 */
public class Cennik {
    
    private String name;
    
    private Client client;
    
    public Map<Product, CennikItem> elements = new HashMap<>();

    public void addOrReplace(Product product, double price) {
        
        CennikItem tmp = elements.get(product);
        
        if(tmp == null) {
            elements.put(product, new CennikItem(product, price));
        } else {
            tmp.setPrice(price);
        }
        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
 
    
    
}
