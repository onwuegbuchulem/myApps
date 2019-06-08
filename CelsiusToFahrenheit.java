package com.examples.myApps;
import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args){
        System.out.print("Input temperature in  degree celsius and hit enter key: ");
        Scanner keyboard = new Scanner(System.in);
        double inputCelsius = keyboard.nextDouble();
        double outputFahrenheit = (32 + ((9.0/ 5) * inputCelsius));
        System.out.println("The corresponding temperature in  degree fahrenheit is: " + outputFahrenheit + " degrees");
    }
}
