package com.examples.myApps;
import java.util.*;
public class ProductOfTwoRandomNumbers {
    public static void main(String[] args){
        int randomNumberOne = (int)(Math.random() * 10);
        int randomNumberTwo = (int)(Math.random() * 10);
        System.out.print(randomNumberOne + " * " + randomNumberTwo + " = ");
        Scanner keyboard = new Scanner(System.in);
        int productOfRandomNumbers = keyboard.nextInt();
        if (productOfRandomNumbers == randomNumberOne * randomNumberTwo) {
            System.out.println("Congratulations!");
        }else {
            System.out.println("You need more practice.");
        }
    }
}
