package com.company;

import java.util.Scanner;
import java.util.Random;


public class Main {

    public static void main(String[] args) {


        System.out.println("Enter the number I am thinking");
        Scanner scan = new Scanner(System.in);
        int numgusse = scan.nextInt();
        {


            // NOTE: Usually this should be a field rather than a method
            // variable so that it is not re-seeded every call.
            Random rand = new Random();

            // nextInt is normally exclusive of the top value,
            // so add 1 to make it inclusive
            int randomNum = rand.nextInt((10 - 1) + 1) + 1;


            while (numgusse != randomNum) {
                System.out.println("You are wrong");
                numgusse = scan.nextInt();

                if (numgusse == randomNum) {
                    System.out.println("You have guessed correct");
                }
            }


            System.out.println("You have guessed what number I am thinking");

        }
    }
}
