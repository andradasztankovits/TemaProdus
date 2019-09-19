package com.fastrackit;

public class Main {
    public static void main(String[] args) {
        Cosmetice firstCosmetice = new Cosmetice();
        firstCosmetice.setColour("red");
        firstCosmetice.setWeight(20);
        firstCosmetice.setDescription("patrat");
        firstCosmetice.setName("crema");
        firstCosmetice.setPrice(52);
        firstCosmetice.setQuantity(10);
        Cosmetice secondCosmetice = new Cosmetice();
        secondCosmetice.setQuantity(3);
        secondCosmetice.setPrice(40);
        secondCosmetice.setName("spray");
        secondCosmetice.setDescription("oval");
        secondCosmetice.setWeight(20);
        secondCosmetice.setColour("blue");

        Electrocasnice firstElectrocasnice = new Electrocasnice();
        firstElectrocasnice.setHeight(13);
        firstElectrocasnice.setLength(10);
        firstElectrocasnice.setType("frigider");
        firstElectrocasnice.setWeight(50);
        firstElectrocasnice.setWidth(12);
        firstElectrocasnice.setDescription("dreptunghiular");
        firstElectrocasnice.setName("bosh");
        firstElectrocasnice.setQuantity(20);
        firstElectrocasnice.setPrice(2500);
        Electrocasnice secondElectrocasnice = new Electrocasnice();
        secondElectrocasnice.setQuantity(10);
        secondElectrocasnice.setName("zanussi");
        secondElectrocasnice.setDescription("rotund");
        secondElectrocasnice.setWidth(35);
        secondElectrocasnice.setWeight(50);
        secondElectrocasnice.setLength(16);
        secondElectrocasnice.setWidth(26);
        secondElectrocasnice.setPrice(3200);
        secondElectrocasnice.setType("aragaz");

    }
}
