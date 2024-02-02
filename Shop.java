package org.example.OOP_Task_1;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Kategori> kategoris;
    
    public Shop() {
        this.kategoris = new ArrayList<>();
    }
public void addKategoris (Kategori kategori) {
    kategoris.add(kategori);
}   
public void printKatalog () {
    for (Kategori kategori : kategoris) {
        System.out.println(kategori.getName());
        ArrayList<Tovar> tovars = kategori.getTovars();
        for (Tovar tovar : tovars) {
            System.out.println(" - " + tovar.getName() + " - " + tovar.getCena() + " - " + tovar.getReiting());
            
        }
    }
}
}


