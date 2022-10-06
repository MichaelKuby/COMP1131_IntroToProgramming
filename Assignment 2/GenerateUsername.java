
//***********************************************************************************************
// GenerateUsername.java
//
// Michael Kuby T00700593
// COMP 1131 Assignment 2: Classes and Objects
// Question 1
// 
// This program prompts for and reads the user's first and last name (separately),
// then displays a string composed of the first four characters of the user's last name,
// followed by the first two letters of the user's first name, followed by a random number
// in the range of 10 to 99.
//***********************************************************************************************

import java.util.*;

public class GenerateUsername
{
    public static void main (String[] args)
    {
        // Declare the necessary scanner and String reference variables
        Scanner keyboard = new Scanner (System.in);
        String firstName, lastName, username;
        
        //Create rng, declare an integer variable, and initialize it to a random number between 10 - 99.
        Random rand = new Random ();
        int num = rand.nextInt(90) + 10;
        
        // Prompt the user to set up a password by inputting their first and last name.
        System.out.println ("Let's set you up with a username.");
        System.out.print ("Please enter your first name: ");
        firstName = keyboard.nextLine();
        
        System.out.print ("Please enter your last name: ");
        lastName = keyboard.nextLine();
        
        // Compose and display the username to the user.
        username = lastName.substring(0,4) + firstName.substring(0,2) + num;
        
        System.out.println ("Username: " + username);
    }
}