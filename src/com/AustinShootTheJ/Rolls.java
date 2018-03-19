package com.AustinShootTheJ;
import java.util.Scanner;

public class Rolls {

    private String[] rolls = new String[]{"white","deluxe","brown"};
    private String roll;
    private boolean isHealthy;

    public Rolls(){
        Scanner in = new Scanner(System.in);
        System.out.println("What type of roll would you like? (W)hite, (D)eluxe, (B)rown ");
        char rollAnswer = in.nextLine().charAt(0);

        switch (rollAnswer){
            case 'w': case 'W':
                setWhiteRoll();
                break;

            case 'd': case 'D':
                setDeluxeRoll();
                break;

            case 'b': case'B':
                setBrownRoll();
                break;

                default:
                    System.out.println("Error in picking rolls! You're getting white!");
                    setWhiteRoll();
                    break;

        }

    }
    public Rolls(boolean isHealthy){
        this.roll = rolls[2];
    }

    public void setWhiteRoll(){
        this.roll = this.rolls[0];


    }

    public void setDeluxeRoll(){
        this.roll = this.rolls[1];


    }

    public void setBrownRoll(){
        this.roll = this.rolls[2];


    }

    public void getType(){
        System.out.println("Roll type is: " + this.roll);
    }

}
