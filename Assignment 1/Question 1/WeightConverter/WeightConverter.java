
//********************************************************************************
// WeightConverter.java
// 
// Michael Kuby T00700593
// Comp 1131 Assignment 1: Data and Expressions
// Question 1
// 
// This program prompts the user for a value in pounds,
// then calculates and displays the value in kilograms.
//********************************************************************************

import java.util.Scanner;

public class WeightConverter
{   
    public static void main (String[] args)
    {
        // Declare variables and conversion factor needed to capture user input and perform conversion
        double poundsWeight, kgsWeight;
        final double CONVERSION_FACTOR = 0.45359237;
        
        // Prompt the user to input a value in pounds.
        Scanner keyboard = new Scanner (System.in);
        System.out.print ("Enter the weight in pounds: ");
        poundsWeight = keyboard.nextDouble ();
        
        // Convert the user input value into kilograms using conversion factor
        kgsWeight = poundsWeight * CONVERSION_FACTOR;
        
        // Display the results
        System.out.println (poundsWeight + " pounds is equivalent to " + kgsWeight + " kilograms.");
    }
}
