package org.example.OOP_Task_1;

import java.util.ArrayList;

public class Kategori {
    private String name;
    private ArrayList<Tovar> tovars;

    public Kategori (String name) {
        this.name = name;
        this.tovars = new ArrayList<>();
    }

public String getName(){
    return name;
}
public ArrayList<Tovar>  getTovars(){
    return tovars;
}
public void addTovar (Tovar tovar) {
    tovars.add( tovar);    
}

public void remoteTovar (Tovar tovar) {
    tovars.remove( tovar);    
}


}
