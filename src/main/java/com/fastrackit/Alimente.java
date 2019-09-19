package com.fastrackit;

public class Alimente extends Produs {
    String finalDate;
    String productsGroup;
//constructor
    public Alimente(String finalDate){
        this.finalDate = finalDate;
    }
    public Alimente(){

    }
    public String getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(String finalDate) {
        this.finalDate = finalDate;
    }

    public String getProductsGroup() {
        return productsGroup;
    }

    public void setProductsGroup(String productsGroup) {
        this.productsGroup = productsGroup;
    }
}
