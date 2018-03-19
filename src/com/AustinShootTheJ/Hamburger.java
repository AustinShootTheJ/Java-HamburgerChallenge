package com.AustinShootTheJ;

public class Hamburger {

   private double basePrice;
   private double totalPrice;
   private boolean isDeluxe = false;
   private Rolls rolls;


    public Hamburger(double basePrice) {
        this.basePrice = basePrice;
        this.totalPrice = this.basePrice;

    }

    public Hamburger(double basePrice,boolean isDeluxe){
        this.basePrice = basePrice;
        this.totalPrice = this.basePrice;
        this.isDeluxe = isDeluxe;
    }

    public Hamburger(Rolls rolls){
        this.basePrice = 4;
        this.totalPrice = this.basePrice;
        this.isDeluxe = false;
        this.rolls = rolls;

    }

    public void addLettuce(){

        Lettuce lettuce = new Lettuce();
        this.totalPrice = this.totalPrice + lettuce.getCost();


    }

    public void addTomato(){

        Tomato tomato = new Tomato();
        this.totalPrice = this.totalPrice + tomato.getCost();


    }


    public void addKetchup(){

        Ketchup ketchup = new Ketchup();
        this.totalPrice = this.totalPrice + ketchup.getCost();


    }


    public void addMustard(){

        Mustard mustard = new Mustard();
        this.totalPrice = this.totalPrice + mustard.getCost();


    }

    public boolean isDeluxe() {
        return isDeluxe;
    }

    public double getTotalPrice() {

        return totalPrice;
    }

    public void displayTotalPrice(){
        System.out.println("Your total is: " + totalPrice);
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
