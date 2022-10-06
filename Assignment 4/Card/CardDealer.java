
//****************************************************************************************************************
// CardDealer.java             Module 5 Writing Classes
//
// Michael Kuby T00700593
// COMP 1131 Assignment 4: Writing Classes
// Question 2
//
// Version 1.0
//
// The following creates five cards at random, then creates five more cards of specific face and suit values.
// Two of the specific cards are boundary cards.
// One of the cards uses invalid values.
//****************************************************************************************************************

import java.util.Scanner;

public class CardDealer
{
    public static void main (String [] args)
    {
        char dealAgain;
        
        do
        {
            
            System.out.println ("Dealing five random cards: ");
            System.out.println();
            
            Card card1 = new Card();
            
            Card card2 = new Card();
            
            Card card3 = new Card();
            
            Card card4 = new Card();
            
            Card card5 = new Card();
            
            System.out.println ("\nDealing five specified cards: ");
            System.out.println();
            
            Card card6 = new Card(1,1);
            
            Card card7 = new Card(4,13);
            
            Card card8 = new Card(2, 7);
            
            Card card9 = new Card(3,0);
            
            Card card10 = new Card(0,15);
            
            System.out.print ("\nRepresent the cards in integer form Y/N? ");
            Scanner keyboard = new Scanner(System.in);
            String response = keyboard.nextLine().toUpperCase();
            char showOrdinal = response.charAt(0);
            
            if (showOrdinal == 'Y')
            {
                System.out.println ("\nThe integer values of the five random cards: \n");
                System.out.println (card1.toStringInt() );
                System.out.println (card2.toStringInt() ); 
                System.out.println (card3.toStringInt() ); 
                System.out.println (card4.toStringInt() ); 
                System.out.println (card5.toStringInt() );
                
                System.out.println ("\nThe integer values of the five specified cards: \n");
                System.out.println (card6.toStringInt() );
                System.out.println (card7.toStringInt() );
                System.out.println (card8.toStringInt() );
                System.out.println (card9.toStringInt() );
                System.out.println (card10.toStringInt() );
                System.out.println ();
            }
            else
                response = ""; // flushes the input
            
            System.out.print ("Deal again Y/N? ");
            response = keyboard.nextLine().toUpperCase();
            dealAgain = response.charAt(0);
            
            System.out.println();
        }
        while (dealAgain != 'N');
    }
}
