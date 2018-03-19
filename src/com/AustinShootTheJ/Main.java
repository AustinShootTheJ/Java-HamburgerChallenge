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


    public static Hamburger addToppings(Hamburger hamburger){
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

