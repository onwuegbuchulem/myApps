package com.examples.myApps;
import java.util.*;
public class ScoresComputation {
    public static void main(String[] args){
        System.out.print("Enter your grade: ");
        Scanner keyboard = new Scanner(System.in);
        String grade = keyboard.next();
        switch (grade){
            case "A":
                System.out.println("Your score is between 100 and 90.");
                break;
            case "B":
                System.out.println("Your score is between 90 and 80.");
                break;
            case "C":
                System.out.println("Your score is between 80 and 70.");
                break;
            case "D":
                System.out.println("Your score is between 70 and 60.");
                break;
            case "F":
                System.out.println("Your score is between 60 and 0.");
                break;
                default:
                  System.out.println("I don't have any idea of your score.");
        }
    }
}
