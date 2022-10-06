
//***********************************************************************************************
// SphereInfo.java
//
// Michael Kuby T00700593
// COMP 1131 Assignment 2: Classes and Objects
// Question 3
// 
// This application reads the radius of a sphere, then calculates and
// diplays the circumference, volume, and surface area correct to four decimal places.
// The following formulas are used: 
//      Circumference   = 2 * pi * r
//      Volume          = 4/3 * pi * r^3
//      Surface Area    = 4 * pi * r^2
//***********************************************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class SphereInfo
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double radius, circumference, volume, surfaceArea;
        
        // Notifies the user of how the program works, and prompts the user for the radius value
        System.out.println ("This application calculates the circumference, volume, and surface area of a sphere"
                            + " correct to four decimal places.");
        System.out.print ("Please enter the radius of the sphere you'd like to know about: ");
        radius = keyboard.nextDouble();
        
        System.out.println("");
        
        // Calculates the circumference, volume, and surface area
        circumference = 2 * Math.PI * radius;
        volume = (4.0/3.0 * Math.PI) * Math.pow(radius, 3);
        surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        
        // Displays the circumference, volume, and surface area correct to 4 decimal places
        DecimalFormat fmt = new DecimalFormat("0.0000");
        
        System.out.println ("The circumference is " + fmt.format(circumference) + " units.");
        System.out.println ("The volume is " + fmt.format(volume) + " units cubed.");
        System.out.println ("The surface area is " + fmt.format(surfaceArea) + " units squared.");
    }
}