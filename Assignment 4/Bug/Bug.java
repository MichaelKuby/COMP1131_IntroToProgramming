
//****************************************************************************************************************
// Bug.java             Module 5 Writing Classes
//
// Michael Kuby T00700593
// COMP 1131 Assignment 4: Writing Classes
// Question 1
//
// Version 1.0
//
// The following designs a class called Bug, which represents a bug moving along a horizontal wire. The bug can
// only move one united of distance at a time, in the direction it is facing. The bug can also reverse direction.
//****************************************************************************************************************

import java.util.Random;

public class Bug
{
    // instance variables
    private int position;
    private String facing; 

    //-------------------------------------------------------------
    // Constructor for objects of class Bug
    //-------------------------------------------------------------
    public Bug()
    {
        // initialise instance variables
        
        Random rng = new Random();
        
        position = rng.nextInt(21)-10; // chooses a random starting position for the bug between -10 and 10.
        
        int facingStart = rng.nextInt(2); // Randomly chooses either 0 or 1, which is used to dictate the direction the bug is facing.
        
        if (facingStart == 0)
            facing = "left";
        else
            facing = "right";
        
        System.out.println ("A bug landed on a wire! It seems like you can help him move.");
        System.out.println ("\nPress: I to move forward \t T to turn around \t O to see the current position and direction faced \t E to exit");
        System.out.println ("\nThe length of the wire appears to go from -10 to 10. Don't fall off the wire!");
        System.out.println();
        System.out.println ("Current position on the wire: " + position + "\nCurrently facing: " + facing);
    }

    //-------------------------------------------------------------
    // Move forward in the direction faced
    //-------------------------------------------------------------
    public void move()
    {
        if (facing == "left")
            position--;
        else
            position++;
        
        System.out.println ("You helped bug move to " + position);
    }
    
    //-------------------------------------------------------------
    // Reverse Direction
    //-------------------------------------------------------------
    public void turn()
    {
        if (facing == "left")
            facing = "right";
        else
            facing = "left";
            
        System.out.println ("Bug turned around!");
    }
    
    //-------------------------------------------------------------
    // Return position value
    //-------------------------------------------------------------
    public int getPosition()
    {
        return position;
    }
    
    //-------------------------------------------------------------
    // Returns the current position and direction being faced
    //-------------------------------------------------------------
    public String toString()
    {
        return "Current position on the wire: " + position + "\nCurrently facing: " + facing;
    }
}
