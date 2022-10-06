
//****************************************************************************************************************
// BugOnWire.java             Module 5 Writing Classes
//
// Michael Kuby T00700593
// COMP 1131 Assignment 4: Writing Classes
// Question 1
//
// Version 1.0
//
// The following instantiates a bug, then allows the user to manipulate the bug with simple commands like:
//      Output (to see the position and direction)
//      Move (moves the bug one unit forward in the direction that it is facing)
//      Turn (reverses direction)
//      Exit (Causes the bug to fly away, and the program to end).
//****************************************************************************************************************

import java.util.Scanner;

public class BugOnWire
{
    public static void main (String[] args)
    {
        char playAgain;
        
        do        
        {    
            Bug bug1 = new Bug();
            
            char userInput = ' ';
            String input;
            Scanner keyboard = new Scanner(System.in);
            
            while (userInput != 'E')
            {   
                input = keyboard.nextLine().toUpperCase();
                userInput = input.charAt(0);
                
                switch (userInput)
                {
                    case 'T':
                        bug1.turn();
                        break;
                        
                    case 'I':
                        bug1.move();
                        break;
                        
                    case 'O':
                        System.out.println ( bug1.toString() );
                        break;
                        
                    case 'E':
                        userInput = 'E';
                        break;
                        
                    default:
                        System.out.println ("Whoops! That's not a valid move.");
                }
                
                if (bug1.getPosition() == 0)
                    System.out.println ("A nice safe spot for bug.");
                
                if (bug1.getPosition() == -10 || bug1.getPosition() == 10)
                    System.out.println ("... careful!");
                
                if (bug1.getPosition() < -10 || bug1.getPosition() > 10)
                    userInput = 'E';
            }
            
            System.out.println ("\nOh no! Bug fell off the wire!");
            
            System.out.print ("Should we find a new bug (Y/N)? ");
            input = keyboard.nextLine().trim().toUpperCase();
            playAgain = input.charAt(0);
            
            System.out.println();
        }
        while (playAgain != 'N');
    }
}