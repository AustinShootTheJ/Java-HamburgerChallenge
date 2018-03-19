package com.AustinShootTheJ;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        greetCustomer().displayTotalPrice();

    }



    public static Hamburger greetCustomer(){
        Scanner in = new Scanner(System.in);
        System.out.println("What kind of burger would you like? (R)egular, (H)ealthy, (D)eluxe");
        char answer = in.nextLine().charAt(0);

        switch (answer) {
            case 'r': case 'R':

               Hamburger hamburger = new Hamburger();

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


    



}

