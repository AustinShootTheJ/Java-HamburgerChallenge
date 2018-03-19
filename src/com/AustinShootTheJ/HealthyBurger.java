package com.AustinShootTheJ;

public class HealthyBurger extends Hamburger {


    public HealthyBurger() {
        super(5.00);
    }

    public void addCarrots(){

        Carrots carrots = new Carrots();
        this.setTotalPrice(this.getTotalPrice() + carrots.getCost());

    }


    public void addKale(){

        Kale kale = new Kale();
        this.setTotalPrice(this.getTotalPrice() + kale.getCost());

    }



}
