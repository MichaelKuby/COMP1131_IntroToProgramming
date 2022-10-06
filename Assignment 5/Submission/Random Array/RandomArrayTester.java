
/**
 * RandomArrayTester.java       Module 6 Arrays
 *
 * Michael Kuby T00700593
 * COMP 1131 Assignment 5: Arrays
 * Question 1
 * 
 * Version 1.0
 * 
 * RandomArrayTester is designed to run the RandomArray class and test it's methods.
 */

import java.util.Scanner;

public class RandomArrayTester
{
    public static void main (String[] args)
    {
        char again;
        
        do
        {
            Scanner keyboard = new Scanner (System.in);
            int size;
            
            do
            {
                System.out.print ("What size of array would you like to create? Please choose an integer greater than zero. ");
                size = keyboard.nextInt();
            }
            
            while (size <= 0);
            
            RandomArray array = new RandomArray(size);
            
            System.out.println();
            System.out.println ("The maximum value found in the array is: " + array.max());
            System.out.println ("The minimum value found in the array is: " + array.min());
            System.out.println ("The average of the values in the array is: " + array.average());
            System.out.println ("The values in the array are: \n\n" + array.toString());
            System.out.println();
            
            //--------------------------------------------------------------------------------------------------------------
            // Prompt the user if they want to create a new random array
            //--------------------------------------------------------------------------------------------------------------
            keyboard.close();
            keyboard = new Scanner (System.in);
            
            System.out.print ("Would you like to create a new random array (Y/N)? " );
            String input = keyboard.nextLine().trim().toUpperCase();
            again = input.charAt(0);
            
            System.out.println();
        }
        while (again != 'N');
    }
}
