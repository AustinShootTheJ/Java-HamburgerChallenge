package com.AustinShootTheJ;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

// we stopped on adding rolls. Need to decide how we are going to do that exactly. 
    addToppings(greetCustomer());

    }



    public static Hamburger greetCustomer(){
        Scanner in = new Scanner(System.in);
        System.out.println("What kind of burger would you like? (R)egular, (H)ealthy, (D)eluxe");
        char answer = in.nextLine().charAt(0);
        Rolls roll = new Rolls();
        switch (answer) {
            case 'r': case 'R':

               Hamburger hamburger = new Hamburger(roll);

                return hamburger;

            case 'h': case 'H':
            HealthyBurger healthyBurger = new HealthyBurger();

                return  healthyBurger;

            case 'd': case 'D':
                DeluxeBurger deluxeBurger = new DeluxeBurger();

                    return deluxeBurger;


            default:
                System.out.println("Error try again");
                break;

        }

        return null;

    }


    public static Hamburger addToppings(Hamburger hamburger){
        if(!hamburger.isDeluxe()) {
            Scanner in = new Scanner(System.in);
            char answer;
            do {

                System.out.println("Would you like to add toppings? Y/N");
                answer = in.nextLine().charAt(0);

                System.out.println("testing");

            } while (answer == 'y' || answer == 'Y');

        }



        return hamburger;

    }



}

