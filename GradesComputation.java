package com.examples.myApps;
import java.util.*;
public class GradesComputation {
    public static void main(String[] args){
        System.out.print("Enter your score : ");
        Scanner keyboard = new Scanner(System.in);
        int score = keyboard.nextInt();
        char grade = 'O';
        if (score <= 100 && score >= 90) {
            grade = 'A';
        }
        if (score < 90 && score >= 80) {
            grade = 'B';
        }
        if (score < 80 && score >= 70) {
            grade = 'C';
        }
        if (score < 70 && score >= 60) {
            grade = 'D';
        }
        if (score < 60 && score >= 0) {
            grade = 'F';
        }
        System.out.println("Your grade is: " + grade + "." );
    }
}
