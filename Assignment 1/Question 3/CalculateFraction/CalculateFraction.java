
//********************************************************************************
// CalculateFraction.java
// 
// Michael Kuby T00700593
// Comp 1131 Assignment 1: Data and Expressions
// Question 3
// 
// This program prompts the user for a numerator and denominator value,
// then calculates and displays the decimal equivalent of the fraction.
//********************************************************************************

import java.util.Scanner;

public class CalculateFraction
{   
    public static void main (String[] args)
    {
        // Declares the variables needed to capture and compute user input
        int numerator, denominator;
        double value;
        
        // Notify the user of the required input form to prevent crashes
        System.out.println ("Please use whole numbers for your input values.");
        
        // Prompt the user for numerator input
        Scanner keyboard = new Scanner (System.in);
        System.out.print ("Enter a numerator: ");
        numerator = keyboard.nextInt ();
        
        // Prompt the user for denominator input
        System.out.print ("Enter a denominator: ");
        denominator = keyboard.nextInt ();
        
        // Compute the value of the fraction as a floating point decimal
        value = (double) numerator / denominator;
        
        // Display the results
        System.out.println (numerator + " / " + denominator + " = " + value);
    }
}
