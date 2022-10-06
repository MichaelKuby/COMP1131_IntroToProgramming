
//***********************************************************************************************
// SecondsConversion.java
// 
// Michael Kuby T00700593
// Comp 1131 Assignment 1: Data and Expressions
// Question 2
// 
// This program prompts the user for a value representing a number of seconds,
// then displays the equivalent amount of time as a combination of hours, minutes, and seconds.
//***********************************************************************************************

import java.util.Scanner;

public class SecondsConversion
{   
    public static void main (String[] args)
    {
        // Declare the variables needed for input and computation.
        int userInput, hours, minutes, seconds;
        int hoursRemainder, minutesRemainder;
        
        // Prompt the user to input a value in seconds.
        Scanner keyboard = new Scanner (System.in);
        System.out.print ("Enter a value in seconds: ");
        userInput = keyboard.nextInt ();
        
        // Determine the number of hours, and remainder, based on the user's input.
        hours = userInput / 3600;
        hoursRemainder = userInput % 3600;
        
        // Determine the number of minutes, and remainder, based on the variable hoursRemainder.
        minutes = hoursRemainder / 60;
        minutesRemainder = hoursRemainder % 60;
        
        // Determine the number of seconds, based on the variable minutesRemainder.
        seconds = minutesRemainder;
        
        // Display the results
        System.out.println ("Hours: " + hours);
        System.out.println ("Minutes: " + minutes);
        System.out.println ("Seconds: " + seconds);
    }
}
