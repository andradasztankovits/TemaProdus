package com.fastrackit;

public class Cosmetice extends Produs {

    String colour;
    int weight;
//constructor
    public Cosmetice(int weight){
        this.weight = weight;
    }
    public Cosmetice(){

    }
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
