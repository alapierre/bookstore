package pl.altkom.bookstore.web.model;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jan Nowak <jan at nowak.org>
 */
public class Terminarz {

    public Date data;

    /**
     *
     * osoba pracownik osoba klient
     */
    private void setTermin(Date data) {
        this.data = data;
    }

    public Date getData() {
        return data;
    }

}
