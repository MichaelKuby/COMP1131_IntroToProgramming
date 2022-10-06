
//*****************************************************************************************
// HiLoGame.java            Module 4 Conditions and Loops
//
// Michael Kuby T00700593
// COMP 1131 Assignment 3: Conditions and Loops
// Question 1
//
// Version 1.1
//
// The following program plays a Hi-Lo guessing game with the user, using numbers.
// A random number between 1 and 100 (inclusive) is chosen. The user is then prompted to
// guess the number. If the guess is high or low, he is notified and prompted to guess
// again. Guesses are accepted until the number is correctly guessed, or the user quits. 
// The number of guesses are counted as each is made, and reported to the user when the 
// number is correctly guessed. If a guess is out of the range [1, 100], the user is 
// prompted to guess again, and that guess is not counted in the running total.
// At the end of each game, the user is prompted to determine whether they want to play again.
//*****************************************************************************************

import java.util.Random;
import java.util.Scanner;

public class HiLoGame
{
    public static void main (String[] args)
    {
        char answer;
        
        do
        {
            // Have the program pick a random number between 1 and 100
        
            Scanner keyboard = new Scanner (System.in);
            Random rand = new Random();
            int num = rand.nextInt(100) + 1;
            int count = 0, guess;
        
            // Prompt user to make a guess, and notify if high, low, or correct
        
            System.out.println ("The computer has picked a random number between 1 and 100 (inclusive).");
            System.out.print ("Take a guess at what the number is, or guess 0 to quit: ");
            guess = keyboard.nextInt();
            
            while (guess != 0) // sentinel value of 0 to terminate loop
            {
                while (guess < 0 || guess > 100) // Ensures that the user's guess is within a valid range
                {
                    System.out.println ("Not great at reading, are we. Your guess is out of range mate.");
                    System.out.print ("Guess again, or guess 0 to quit: ");
                    guess = keyboard.nextInt();
                }
                    
                count++; // keeps track of the number of valid guesses the user makes.
                
                if (guess == num)
                {
                    if (count > 1)
                    {
                        System.out.print ("\nBingo bango! The number is " + num + ". Nice work champ. ");
                        System.out.println ("That took you " + count + " guesses. You can do better.");
                        System.out.println();
                        break;
                    }
                    else
                    {
                        System.out.println ("\nFirst guess? Seriously? Go buy a damn lotto ticket.");
                        System.out.println();
                        break;
                    }
                }
                else
                {
                    if (guess == 0) // This catches instances where the initial guess is out of range, and the second guess is 0 (user opts to quit).
                        guess = 0;
                        
                    else // This section of else statements deals with situations where the guess is high or low.
                    {
                        if (guess > num)
                        {
                            System.out.println (guess + " is a bit high.");
                            System.out.print ("Guess again, or guess 0 to quit: ");
                            guess = keyboard.nextInt();
                        }
                        else
                        {
                            System.out.println (guess + " is a bit low.");
                            System.out.print ("Guess again, or guess 0 to quit: ");
                            guess = keyboard.nextInt();
                        }
                    }    
                }
            }
            // Flush the rest of the line to avoid string out of bounds exception
            String playAgain;
            playAgain = keyboard.nextLine();
        
            // Prompt the user if they want to play again
            System.out.print ("Play again (Y/N)? ");
            playAgain = keyboard.nextLine().trim().toUpperCase();
            answer = playAgain.charAt(0);
            
            System.out.println ();
        }
        
        while (answer == 'Y');
    }
}        
