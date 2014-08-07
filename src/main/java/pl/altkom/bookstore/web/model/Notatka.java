/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.web.model;

import java.util.Date;

/**
 * Notatka z aktywności / spotkania z klientem
 * 
 * @author Marcin Kępa <your.name at your.org>
 */
public class Notatka {
   
    private String tytul;
    
    private Date data;
    
    private String trescNotatki;
    
    private Person autorNotatki;
    
    private Client client;

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTrescNotatki() {
        return trescNotatki;
    }

    public void setTrescNotatki(String trescNotatki) {
        this.trescNotatki = trescNotatki;
    }

    public Person getAutorNotatki() {
        return autorNotatki;
    }

    public void setAutorNotatki(Person autorNotatki) {
        this.autorNotatki = autorNotatki;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    
}
