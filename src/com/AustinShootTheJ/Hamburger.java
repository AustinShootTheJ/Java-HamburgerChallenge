package com.AustinShootTheJ;

import java.util.Scanner;

public class Hamburger {

   private double basePrice;
   private double totalPrice;
   private boolean isDeluxe;
   private Rolls rolls;


    public Hamburger(double basePrice) {
        this.basePrice = basePrice;
        this.totalPrice = this.basePrice;
        this.addToppings(this);

    }

    public Hamburger(double basePrice,boolean isDeluxe){
        this.basePrice = basePrice;
        this.totalPrice = this.basePrice;
        this.isDeluxe = isDeluxe;
        this.rolls = rolls;
        this.addToppings(this);
    }

    public Hamburger(){
        this.basePrice = 4;
        this.totalPrice = this.basePrice;
        this.isDeluxe = false;
        Rolls regularRoll = new Rolls();
        this.setRolls(regularRoll);
        this.addToppings(this);

    }

    public void addLettuce(){

        Lettuce lettuce = new Lettuce();
        this.totalPrice = this.totalPrice + lettuce.getCost();
        System.out.println("Lettuce added for " + lettuce.getCost());


    }

    public void addTomato(){

        Tomato tomato = new Tomato();
        this.totalPrice = this.totalPrice + tomato.getCost();
        System.out.println("Tomato added for " + tomato.getCost());


    }


    public void addKetchup(){

        Ketchup ketchup = new Ketchup();
        this.totalPrice = this.totalPrice + ketchup.getCost();
        System.out.println("Ketchup added for " + ketchup.getCost());


    }


    public void addMustard(){

        Mustard mustard = new Mustard();
        this.totalPrice = this.totalPrice + mustard.getCost();
        System.out.println("Mustard added for " + mustard.getCost());


    }


    public void addCarrots(){

        Carrots carrots = new Carrots();
        this.setTotalPrice(this.getTotalPrice() + carrots.getCost());
        System.out.println("Carrots added for " + carrots.getCost());

    }


    public void addKale(){

        Kale kale = new Kale();
        this.setTotalPrice(this.getTotalPrice() + kale.getCost());
        System.out.println("Kale added for " + kale.getCost());

    }


    public boolean isDeluxe() {
        return this.isDeluxe;
    }

    public double getTotalPrice() {

        return this.totalPrice;
    }

    public void setRolls(Rolls rolls) {
        this.rolls = rolls;
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


    public  Hamburger addToppings(Hamburger hamburger){
        if(hamburger.isDeluxe() == false) {
            Scanner in = new Scanner(System.in);
            char answer;
            do {
                System.out.println("Would you like to add toppings? Y/N");
                answer = in.nextLine().charAt(0);
                if(answer == 'y' || answer == 'Y') {

                    System.out.println("What would you like to add? L, T, K, M");
                    Scanner in2 = new Scanner(System.in);
                    char answer2 = in2.nextLine().charAt(0);
                    switch (answer2) {
                        case 'l':
                        case 'L':
                            hamburger.addLettuce();
                            break;

                        case 't':
                        case 'T':
                            hamburger.addTomato();
                            break;

                        case 'K':
                        case 'k':
                            hamburger.addKetchup();
                            break;

                        case 'm':
                        case 'M':
                            hamburger.addMustard();
                            break;

                        default:
                            System.out.println("No toppings added");
                            break;


                    }
                } else{break;}

            } while (answer == 'y' || answer == 'Y');

        }



        return hamburger;

    }




}
