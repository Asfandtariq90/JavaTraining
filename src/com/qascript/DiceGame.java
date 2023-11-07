package com.qascript;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if( number > 6){
            System.out.println("You have entered a number greater than 6");
        }
        else
        {
            System.out.println("You lost the game");
        }
    }
}
