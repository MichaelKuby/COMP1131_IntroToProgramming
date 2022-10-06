//****************************************************************************************************************
// DeckofCardsDriver.java             Module 6/7 Arrays and Recursion
//
// Michael Kuby T00700593
// COMP 1131 Assignment 5: Arrays and Recursion
// Question 2
//
// Version 1.0
//
// DeckOfCardsDriver runs the main method utilizing DeckOfCards. It's purpose is to show the functionality
// of the DeckOfCards Class. It first outputs a populated deck to show it's complete, then shuffles the deck, 
// and then deals each card from a shuffled deck, displaying each card as it is dealt, along with the number of
// cards left in the deck.
//****************************************************************************************************************

import java.util.Scanner;

public class DeckOfCardsDriver
{
   public static void main (String[] args)
   {
       char again;
       
       do
       {
        // Create a new deck of cards
        DeckOfCards deck = new DeckOfCards();

        // Print out the contents of the fully populated deck
        System.out.println ("Dealing a fully populated deck: ");
        System.out.println();
        System.out.println (deck.toString());
        
        // Shuffle the deck
        System.out.println ("Dealer is now shuffling the deck... \n");
        deck.shuffle();
        
        /**
         * This for loop deals each card in the deck, then prints the number of remaining cards.
         * Note that deck.remaining() naturally decrements after each card is dealt, hence we leave index at 0.
         */
        for (int index = 0; index < deck.remaining(); ) 
        {   
            System.out.print ("Dealer to deal a card... it's the " + deck.deal() + ". ");
            System.out.println ( "\t" + deck.remaining() + " cards remain in the deck");
        }
       
        
        // Prompt the user if they want to deal a new deck of cards
        System.out.println();
        Scanner keyboard = new Scanner (System.in);
        keyboard = new Scanner (System.in);
        
        System.out.print ("Would you like to deal a new deck of cards (Y/N)? " );
        String input = keyboard.nextLine().trim().toUpperCase();
        again = input.charAt(0);
        
        System.out.println(); 
       }

       while (again != 'N');
   }
}
