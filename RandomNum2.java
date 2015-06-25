package com.company;

import java.util.Scanner;
import java.util.Random;


public class RandomNum {

    public static void main(String[] args) {


        System.out.println("Enter the number I am thinking");
        Scanner scan = new Scanner(System.in);
        int numgusse = scan.nextInt();
        {


           
            Random rand = new Random();

            
            int randomNum = rand.nextInt((10 - 1) + 1) + 1;


            while (numgusse != randomNum) {
                System.out.println("You are wrong");
                numgusse = scan.nextInt();

                if (numgusse == randomNum) {
                    System.out.println("You have guessed correct");
                }
            }


            System.out.println("You have guessed what number I am thinking");
            System.out.println("Well done"); 

        }
    }
}
