/**
 * RandomArray.java         Module 6 Arrays
 *
 * Michael Kuby T00700593
 * COMP 1131 Assignment 5: Arrays
 * Question 1
 * 
 * Version 1.0
 * 
 * RandomArray allows us to receive the size of an array from the caller, then populates the array with random
 * numbers from 0 - the size of the array. 
 * 
 * Methods include: 
 *      integer return of the minimum value and maximum value; 
 *      double return of the average value;
 *      String representation of the array values.
 */

import java.util.Random;

public class RandomArray
{
    // instance variables 
    private int[] array;

    /**
     * Constructor that receives the size of the array to be allocated, 
     * then populates the array with random numbers from the range [ 0, the size of the array ].
     */
    public RandomArray(int size)
    {
        array = new int[size];
        Random rng = new Random();
        
        for (int index = 0; index < array.length; index++)
        {
            array[index] = rng.nextInt(array.length+1);
        }
    }
    
    /**
     * Maximum Value
     *
     * @return    the maximum value found in the array.
     */
    public int max()
    {
        int max = array[0];
        
        for (int index = 0; index < array.length; index++)
            if (array[index] > max)
                max = array[index];
        
        return max;
    }
    
    /**
     * Minimum Value
     *
     * @return    the minimum value found in the array.
     */
    public int min()
    {
        int min = array[0];
        
        for (int index = 0; index < array.length; index++)
            if (array[index] < min)
                min = array[index];
        
                return min;
    }
    
    /**
     * Average Value
     *
     * @return    the average value of the integers in the array
     */
    public double average()
    {
        double num = 0, denom = array.length, average = 0;
        if (array.length == 0)
            return 0;
        else
            for (int index = 0; index < array.length; index++)
                num += array[index];
        
        average = num / denom;
        
        return average;
    }
    
    /**
     * A string representation of the array values
     *
     * @return    A string of values
     */
    public String toString()
    {
        String str = "";
        int count = 0;
        
        for (int index = 0; index < array.length; index++)
        {    
            str += array[index] + "\t\t";
            count++;
            
            if (count % 5 == 0)
                str += "\n";
        }    
        return str;
    }
}
