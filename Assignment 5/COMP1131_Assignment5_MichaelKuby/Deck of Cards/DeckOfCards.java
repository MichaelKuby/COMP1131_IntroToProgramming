
//****************************************************************************************************************
// DeckofCards.java             Module 6/7 Arrays and Recursion
//
// Michael Kuby T00700593
// COMP 1131 Assignment 5: Arrays and Recursion
// Question 2
//
// Version 1.0
//
// DeckOfCards stores 52 objects of the Card class using an array. It has a method to shuffle the deck, 
// deal a card, return the number of cards left in the deck, and show the contents of the deck.
//****************************************************************************************************************

import java.util.Random;

public class DeckOfCards
{
    private Card[] deck;
    private Card[] dealt;
    private int j = 0;
    private int remain;
    /**
     * Constructor for objects of class DeckOfCards
     */
    public DeckOfCards()
    {
        // initialise instance variables
        deck = new Card[52];
        dealt = new Card[52];
        int index = 0;
        
        for (int suit = 1; suit <= 4; suit++)
        {
            for (int rank = 1; rank <= 13; rank++)
            {
                deck[index] = new Card(suit, rank);
                index++;
            }
        }
    }

    /**
     * Output the contents of the deck
     *
     * @return    A string t describing each card in the deck, in order.
     */
    public String toString()
    {
        String str = "";
        for (int index = 0; index < deck.length; index++)
        {   
            if (deck[index] != null)
                str += deck[index] + "\n";
        }
        return str;
    }

    /**
     * Output the contents of the dealt cards
     *
     * @return    A string describing each card that has been dealt, in order.
     */
    public String toStringDealt()
    {
        String str = "";
        for (int index = 0; index < dealt.length; index++)
        {   
            if (dealt[index] != null)
                str += dealt[index] + "\n";
        }
        return str;
    }    
    
    /**
     * Shuffles the deck 
     */
    public void shuffle()
    {
        Random rng = new Random();
        for (int index = 0; index < deck.length; index++)
        {
            // Create a new card called temp, which stores the data of the card at the index
            Card temp = deck[index];
            
            // Choose a random number between 0 - 51
            int rand = rng.nextInt(52);
            
            // Use the random number to swap a card in the deck with the card at index
            deck[index] = deck[rand];
            
            // replace the random card with the original data of the indexed card.
            deck[rand] = temp;
        }
    }
    
    /**
     * Deal a card
     */
    public Card deal()
    {
        /**
         * Note how j serves to track the next cell in the deck array that holds an object card, while also
         * tracking the next empty cell in dealt. Since we need to increment j in the method prior to the return statement,
         * we return dealt[j-1].
         */
        dealt[j] = deck[j];
        deck[j] = null;
        j++;
        return dealt[j-1];
    }
    
    /**
     * Return the number of cards remaining. j tracks the number of cards that have been dealt, so the remaining cards
     * in deck equals the length of the array minus j.
     */
    public int remaining()
    {
        return remain = deck.length - j;
    }
}