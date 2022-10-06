
//****************************************************************************************************************
// Card.java             Module 5 Writing Classes
//
// Michael Kuby T00700593
// COMP 1131 Assignment 4: Writing Classes
// Question 2
//
// Version 1.0
//
// The following class represents a standard playing card. Each card has a suit and face value.
// Each card ranks from Ace through King as 1 through 13.
// Each suit is represented as 1 through 4.
// There are two constructors: one that allows us to choose the card; and another that randomly generates a card.
//****************************************************************************************************************

import java.util.Random;

public class Card
{
    // Create Rank and Suit variables
    enum Suit {Hearts, Diamonds, Spades, Clubs}
    enum Rank {Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King}
    
    // Declare instance variables
    private Suit currentSuit;
    private Rank currentRank;

    //--------------------------------------------------------------------------
    // Randomized Constructor
    //--------------------------------------------------------------------------
    public Card()
    {
        // initialise instance variables
        
        this.randomCard();
        
        System.out.println ("\t" + toString());
    }
    
    //--------------------------------------------------------------------------
    // Constructor with specific parameters
    //--------------------------------------------------------------------------
    public Card(int suitVal, int rankVal)
    {
        // initialise instance variables
        if ((suitVal >= 1 && suitVal <= 4) && (rankVal >= 1 && rankVal <= 13))
        {    
            currentSuit = setSuit(suitVal);
            currentRank = setRank(rankVal);
            System.out.println ("\t" + toString());
        }
        else
        {
            if ((suitVal >= 1 && suitVal <= 4) || (rankVal >= 1 && rankVal <= 13))
                System.out.println ("\tOne of the paramaters entered is invalid. No such card exists.");
            else
                System.out.println ("\tBoth of the parameters entered are invalid. No such card exists.");
        }
    }
    
    //--------------------------------------------------------------------------
    // Randomizes the specified card. Also used for instantiation.
    //--------------------------------------------------------------------------
    public void randomCard()
    {
        currentSuit = randomSuit();
        
        currentRank = randomRank();
    }
    
    //--------------------------------------------------------------------------
    // A support method for the Card() constructor and randomCard() method.
    // Randomizes the suit of the current card.
    // Returns Suit: Hearts, Diamonds, Spades, Clubs
    //--------------------------------------------------------------------------
    private Suit randomSuit()
    {
        Random rng = new Random();
        
        int value = rng.nextInt(4)+1;
        
        switch (value)
        {
            case 1:
                currentSuit = Suit.Hearts;
                break;
                
            case 2:
                currentSuit = Suit.Diamonds;
                break;
            
            case 3:
                currentSuit = Suit.Spades;
                break;
                
            case 4:
                currentSuit = Suit.Clubs;
                break;
        }
        
        return currentSuit;
    }
    
    //--------------------------------------------------------------------------
    // A support method for the Card() constructor and randomCard() method.
    // Randomizes the rank of the current card
    // Returns Rank: Ace, Deuce, ... , Queen, King
    //--------------------------------------------------------------------------
    private Rank randomRank()
    {
        Random rng = new Random();
        
        int value = rng.nextInt(13)+1;
        
        switch (value)
        {
            case 1:
                currentRank = Rank.Ace;
                break;
                
            case 2:
                currentRank = Rank.Deuce;
                break;
                
            case 3:
                currentRank = Rank.Three;
                break;
            
            case 4:
                currentRank = Rank.Four;
                break;
            
            case 5:
                currentRank = Rank.Five;
                break;

            case 6:
                currentRank = Rank.Six;
                break;
                
            case 7:
                currentRank = Rank.Seven;
                break;
                
            case 8:
                currentRank = Rank.Eight;
                break;
            
            case 9:
                currentRank = Rank.Nine;
                break;
                
            case 10:
                currentRank = Rank.Ten;
                break;
                
            case 11:
                currentRank = Rank.Jack;
                break;
                
            case 12:
                currentRank = Rank.Queen;
                break;
            
            case 13:
                currentRank = Rank.King;
                break;
        }
        
        return currentRank;
    }
    
    //--------------------------------------------------------------------------
    // Mutates the Suit of the current card
    //--------------------------------------------------------------------------
    public Suit setSuit (int setSuit)
    {
        switch (setSuit)
        {
            case 1:
                currentSuit = Suit.Hearts;
                break;
                
            case 2:
                currentSuit = Suit.Diamonds;
                break;
            
            case 3:
                currentSuit = Suit.Spades;
                break;
                
            case 4:
                currentSuit = Suit.Clubs;
                break;
                
            default:
                break;
        }
        
        return currentSuit;
    }
    
    //--------------------------------------------------------------------------
    // Accesses the integer value of the Suit of the current card
    //--------------------------------------------------------------------------
    public int getSuit ()
    {
        return currentSuit.ordinal() + 1;
    }
    
    //--------------------------------------------------------------------------
    // Accesses the text value of the Suit of the current card
    //--------------------------------------------------------------------------
    public Suit getSuitText ()
    {
        return currentSuit;
    }
    
    //--------------------------------------------------------------------------
    // Mutates the Rank of the current card
    //--------------------------------------------------------------------------
    public Rank setRank(int setRank)
    {
        switch (setRank)
        {
            case 1:
                currentRank = Rank.Ace;
                break;
                
            case 2:
                currentRank = Rank.Deuce;
                break;
                
            case 3:
                currentRank = Rank.Three;
                break;
            
            case 4:
                currentRank = Rank.Four;
                break;
            
            case 5:
                currentRank = Rank.Five;
                break;

            case 6:
                currentRank = Rank.Six;
                break;
                
            case 7:
                currentRank = Rank.Seven;
                break;
                
            case 8:
                currentRank = Rank.Eight;
                break;
            
            case 9:
                currentRank = Rank.Nine;
                break;
                
            case 10:
                currentRank = Rank.Ten;
                break;
                
            case 11:
                currentRank = Rank.Jack;
                break;
                
            case 12:
                currentRank = Rank.Queen;
                break;
            
            case 13:
                currentRank = Rank.King;
                break;
            
            default:
                break;
        }
        
        return currentRank;
    }
    
    //--------------------------------------------------------------------------
    // Accesses the integer value of the Rank of the current card
    //--------------------------------------------------------------------------
    public int getRank ()
    {
            return currentRank.ordinal() + 1;
    }
    
    //--------------------------------------------------------------------------
    // Accesses the text value of the Suit of the current card
    //--------------------------------------------------------------------------
    public Rank getRankText ()
    {
        return currentRank;
    }
    
    //--------------------------------------------------------------------------
    // toString Method displaying text values
    //--------------------------------------------------------------------------
    public String toString ()
    {
        if (( currentRank == Rank.Ace) || (currentRank == Rank.Deuce) || (currentRank == Rank.Three) || (currentRank == Rank.Four) || (currentRank == Rank.Five) || (currentRank == Rank.Six) || (currentRank == Rank.Seven) || (currentRank == Rank.Eight) || 
                               (currentRank == Rank.Nine) || (currentRank == Rank.Ten) || (currentRank == Rank.Jack) || (currentRank == Rank.Queen) || (currentRank == Rank.King) && (currentSuit == Suit.Hearts) || (currentSuit == Suit.Diamonds) 
                               || (currentSuit == Suit.Spades) || (currentSuit == Suit.Clubs) )
            return currentRank + " of " + currentSuit;
        else
            return "Invalid Card";
    }
    
    //--------------------------------------------------------------------------
    // toString Method displaying integer values
    //--------------------------------------------------------------------------
    public String toStringInt ()
    {
        if (( currentRank == Rank.Ace) || (currentRank == Rank.Deuce) || (currentRank == Rank.Three) || (currentRank == Rank.Four) || (currentRank == Rank.Five) || (currentRank == Rank.Six) || (currentRank == Rank.Seven) || (currentRank == Rank.Eight) || 
                               (currentRank == Rank.Nine) || (currentRank == Rank.Ten) || (currentRank == Rank.Jack) || (currentRank == Rank.Queen) || (currentRank == Rank.King) && (currentSuit == Suit.Hearts) || (currentSuit == Suit.Diamonds) 
                               || (currentSuit == Suit.Spades) || (currentSuit == Suit.Clubs) )
            return "\tRank: " + getRank() + " \tSuit: " + getSuit();
        else
            return "\tSpecified values are invalid.";
    }
}
