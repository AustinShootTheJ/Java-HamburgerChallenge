package com.AustinShootTheJ;
import java.util.Scanner;

public class Rolls {

    private String[] rolls = new String[]{"white","cheesy","brown"};
    private String roll;

    public Rolls(){
        Scanner in = new Scanner(System.in);
        System.out.println("What type of roll would you like? ");
        char rollAnswer = in.nextLine().charAt(0);

        switch (rollAnswer){
            case 'w': case 'W':
                this.roll = rolls[0];
                break;
                default:
                    System.out.println("error in picking rolls!");
                    break;

        }

    }

}
