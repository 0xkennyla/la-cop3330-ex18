/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kenny La
 */
package org.example;
import java.util.Scanner;

public class Exercise18 {
    public static void main (String []args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        String userInput = scan.next();
        System.out.println("Your choice: "+ userInput);

        if (userInput.equalsIgnoreCase("C")) {
            System.out.println("Please enter the temperature in Fahrenheit:");
            double temp = scan.nextDouble();
            double C = (temp - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " + C + ".");
        }

        else if (userInput.equalsIgnoreCase("F")) {
            System.out.println("Please enter the temperature in Celsius:");
            double temp = scan.nextDouble();
            double F = (temp * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + F + ".");
        }
    }
}