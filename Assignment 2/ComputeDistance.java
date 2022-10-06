
//***********************************************************************************************
// ComputeDistance.java
//
// Michael Kuby T00700593
// COMP 1131 Assignment 2: Classes and Objects
// Question 2
// 
// This program prompts for four values that compose the (x, y) coordinates for two points,
// then computes the distance between the two points using the formula:
//      Distance = sqrt[ (x_2 - x_1)^2 + (y_2 - y_1)^2 ]
//***********************************************************************************************

import java.util.Scanner;

public class ComputeDistance
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        
        double x1, x2, y1, y2;
        double changeX,changeY, distance;
        
        // Prompt the user for the coordinates of point 1.
        System.out.println ("Let's compute the distance between two points.");
        System.out.println ("");
        
        System.out.print ("Please enter the x coordinate for point 1: ");
        x1 = keyboard.nextDouble();
        System.out.print ("Please enter the y coordinate for point 1: ");
        y1 = keyboard.nextDouble();
        
        System.out.println ("The coordinates for point 1 are: (" + x1 + ", " + y1 + ")");
        System.out.println ("");
        
        //Prompt the user for the coordinates of point 2:
        System.out.print ("Please enter the x coordinate for point 2: ");
        x2 = keyboard.nextDouble();
        System.out.print ("Please enter the y coordinate for point 2: ");
        y2 = keyboard.nextDouble();
        
        System.out.println ("The coordinates for point 2 are: (" + x2 + ", " + y2 + ")");
        System.out.println ("");
        
        // Compute the distance between the two points and display the results to the user
        changeX = x2 - x1;
        changeY = y2 - y1;
        distance = Math.sqrt(Math.pow(changeX, 2) + Math.pow(changeY, 2));
        
        System.out.println ("The distance between the two points is: " + distance);
    }
}