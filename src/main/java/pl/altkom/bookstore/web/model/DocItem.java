/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.web.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
 * @author rmi
 */
@Entity
public class DocItem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;
    
    //Product - (nazwa, opis, jednostka, stawka VAT)
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    private String adnotacje;
    private double iloscZam;
    private double cenaNetto;
    private double cenaBrutto;
    private double wartoscVAT;
    private double rabat;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataDostawy;

    public DocItem() {
    }
    
    public DocItem(Product product, String adnotacje, double iloscZam, double cenaNetto, double cenaBrutto, double wartoscVAT, double rabat, Date dataDostawy) {
        this.product = product;
        this.adnotacje = adnotacje;
        this.iloscZam = iloscZam;
        this.cenaNetto = cenaNetto;
        this.cenaBrutto = cenaBrutto;
        this.wartoscVAT = wartoscVAT;
        this.rabat = rabat;
        this.dataDostawy = dataDostawy;
    }
    
    public String getAdnotacje() {
        return adnotacje;
    
    }
    public double getIloscZam() {
        return iloscZam;
    }

    public double getCenaNetto() {
        return cenaNetto;
    }

    public double getCenaBrutto() {
        return cenaBrutto;
    }

    public double getWartoscVAT() {
        return wartoscVAT;
    }

    public double getRabat() {
        return rabat;
    }

    public Date getDataDostawy() {
        return dataDostawy;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "DocItem{" + "product=" + product + ", adnotacje=" + adnotacje + ", iloscZam=" + iloscZam + ", cenaNetto=" + cenaNetto + ", cenaBrutto=" + cenaBrutto + ", wartoscVAT=" + wartoscVAT + ", rabat=" + rabat + ", dataDostawy=" + dataDostawy + '}';
    }

        private static void saveTryWithResource(File file, DocItem docItem) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {

            // bw.append(docItem.);
            bw.newLine();
        } catch (IOException ex) {
            System.out.println("błąd zapisu");
            System.out.println(ex.getMessage());
        }
    }

    private static void serialize() throws FileNotFoundException, IOException, ParseException {

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("docItem.ser"))) {
            Date data = new Date();
            SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
            try {
                data = d.parse("2015-01-21");
            } catch (ParseException ex) {
                Logger.getLogger(DocItem.class.getName()).log(Level.SEVERE, null, ex);
            }
            Product product = new Product(
                    14,
                    "Way beyond monochrome",
                    15.56,
                    8.00,
                    "szt.");
            DocItem docItem = new DocItem(
                    product,
                    "Zapakowany po 15 sztuk",
                    12478,
                    14.00,
                    17.22,
                    3.22,
                    10,
                    data
            );
            out.writeObject(docItem);
            }
    }
    
    private static DocItem deserialize() throws FileNotFoundException, IOException, ClassNotFoundException {

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("docItem.ser"));

        DocItem docItem = (DocItem) in.readObject();

        return docItem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}


