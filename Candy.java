package com.example.candy;

public class Candy {

    private int id;
    private String name;
    private double price;

    public Candy(int newId ,String newName, double newPrice) {
        setId(newId);
        setName(newName);
        setPrice(newPrice);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if(price >= 0.0)
            this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return id + " " + name + " "+price;
    }
}
