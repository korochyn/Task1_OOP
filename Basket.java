package org.example.OOP_Task_1;

import java.util.ArrayList;

public class Basket {

    private ArrayList<Tovar> tovars;

    public Basket (){
        this.tovars = new ArrayList<>();
    }
     public ArrayList<Tovar> getTovars () {
        return tovars;
     }
     public void addTovar (Tovar tovar) {
        tovars.add( tovar);    
    }
    
        public void remoteTovar (Tovar tovar) {
        tovars.remove( tovar);    
    }

}
