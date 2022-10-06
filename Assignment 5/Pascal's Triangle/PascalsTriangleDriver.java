//****************************************************************************************************************
// PascalsTriangleDriver.java             Module 6/7 Arrays and Recursion
//
// Michael Kuby T00700593
// COMP 1131 Assignment 5: Arrays and Recursion
// Question 3
//
// Version 1.0
//
// PascalsTriangleDriver runs the main method for class PascalsTriangle. It simply asks the user for the number
// of rows they would like to solve for, outputs the result, and asks the user if they'd like to solve again.
//****************************************************************************************************************
import java.util.Scanner;

public class PascalsTriangleDriver
{
    public static void main (String[] args)
    {
        char again;
        do
        {
            Scanner keyboard = new Scanner (System.in);
            int answer;
            
            do
            {
                System.out.print("How many lines of Pascal's Triangle would you like to solve? ");
                answer = keyboard.nextInt();
                System.out.println();

            }
            while (answer < 0);
            
            PascalsTriangle newTriangle = new PascalsTriangle(answer);
            
            System.out.println (newTriangle.toString());
            
            // Prompt the user if they want to solve for a new line of Pascal's Triangle
            keyboard.close();
            System.out.println();
            keyboard = new Scanner (System.in);
            
            System.out.print ("Would you like to solve for another row of Pascal's Triangle (Y/N)? " );
            String input = keyboard.nextLine().trim().toUpperCase();
            again = input.charAt(0);
            
            System.out.println(); 
        }
        while (again != 'N');
    }
}
