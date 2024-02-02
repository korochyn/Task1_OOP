package org.example.OOP_Task_1;

public class Tovar {
    private String name;
    private Double cena;
    private Integer reiting;

    public Tovar () {
    }

    public Tovar(String name, Double cena, Integer reiting) {
        this.name = name;
        this.cena = cena;
        this.reiting = reiting;
    }


    public String getName() {
        return name; }
    public void setName(String name) {
        this.name = name;
    }

    public Double getCena() {
        return cena; }
    public void setCena(Double cena) {
        this.cena = cena;
    }

    public Integer getReiting() {
        return reiting; }
    public void setReiting(Integer reiting) {
        this.reiting = reiting;
    }

    
}
