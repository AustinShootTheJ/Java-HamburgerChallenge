package com.AustinShootTheJ;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger(){
        super(7.00,true);
    }

    @Override
    public void addLettuce() {
        System.out.println("Cannot add to the deluxe!");
    }

    @Override
    public void addTomato() {
        System.out.println("Cannot add to the deluxe!");
    }

    @Override
    public void addKetchup() {
        System.out.println("Cannot add to the deluxe!");
    }

    @Override
    public void addMustard() {
        System.out.println("Cannot add to the deluxe!");
    }
}
