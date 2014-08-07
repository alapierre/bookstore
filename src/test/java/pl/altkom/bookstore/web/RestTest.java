/*
 * Copyright 2014-08-07 the original author or authors.
 */

package pl.altkom.bookstore.web;

import org.junit.Test;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import pl.altkom.bookstore.web.model.Address;

/**
 *
 * @author Adrian Lapierre <adrian@softproject.com.pl>
 */
public class RestTest {
    
    @Test
    public void testRest() throws IOException {
        
        ObjectMapper mapper = new ObjectMapper();
        
        String url = "http://localhost:8084/bookstore-web/address/save";
        
        Address a = new Address();
        a.setCiti("rzeszow");
        a.setPostcode("00-000");
        a.setStreet("lalala");
        
        String json = mapper.writeValueAsString(a);
        
        System.out.println(json);
        
        Client client = Client.create();
        //client.addFilter(new HTTPBasicAuthFilter(user, pass));

        WebResource webResource = client.resource(url);
        webResource.type(javax.ws.rs.core.MediaType.APPLICATION_JSON_TYPE);

        ClientResponse response = webResource.accept("application/json")
                .post(ClientResponse.class, json);

//        if (response.getStatus() != 200) {
//            throw new RuntimeException("Failed : HTTP error code : "
//                    + response.getStatus());
//        }

        String outputFromServer = response.getEntity(String.class);
        
        System.out.println(outputFromServer);
        
//        Map<String, String> map;
//        
//        map = mapper.readValue(outputFromServer, HashMap.class);
//
//        System.out.println(map);
        
    }
    
}
