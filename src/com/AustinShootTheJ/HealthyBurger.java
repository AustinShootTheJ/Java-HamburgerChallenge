package com.AustinShootTheJ;

import java.util.Scanner;

public class HealthyBurger extends Hamburger {


    public HealthyBurger() {
        super(5.00);
        Rolls healthyRoll = new Rolls(true);
        this.setRolls(healthyRoll);
    }



@Override
    public Hamburger addToppings(Hamburger hamburger) {
        if(hamburger.isDeluxe() == false) {
        Scanner in = new Scanner(System.in);
        char answer;
        do {
            System.out.println("Would you like to add toppings? Y/N");
            answer = in.nextLine().charAt(0);
            if(answer == 'y' || answer == 'Y') {

                System.out.println("What would you like to add? L, T, K, M, k, C");
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

                        hamburger.addKetchup();
                        break;

                    case 'm':
                    case 'M':
                        hamburger.addMustard();
                        break;

                    case 'k':
                        hamburger.addKale();
                        break;

                    case 'c': case 'C':
                        hamburger.addCarrots();
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
