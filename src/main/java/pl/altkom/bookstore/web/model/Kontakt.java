/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.web.model;

import java.io.Serializable;

/**
 *
 * @author Marcin Kępa <your.name at your.org>
 */
public class Kontakt implements Serializable{
   
    public int numerTelefonu;
    
    public String email;
    
    public Address adres;
    
    public TypKontaktu preferowanyKontakt;

    public int getNumerTelefonu() {
        return numerTelefonu;
    }

    public void setNumerTelefonu(int numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAdres() {
        return adres;
    }

    public void setAdres(Address adres) {
        this.adres = adres;
    }

    public TypKontaktu getPreferowanyKontakt() {
        return preferowanyKontakt;
    }

    public void setPreferowanyKontakt(TypKontaktu preferowanyKontakt) {
        this.preferowanyKontakt = preferowanyKontakt;
    }
    
    
}
