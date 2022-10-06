//****************************************************************************************************************
// PascalsTriangle.java     Module 6/7 Arrays and Recursion
//
// Michael Kuby T00700593
// COMP 1131 Assignment 5: Arrays and Recursion
// Question 3
//
// Version 1.0
//
// Pascals Triangle solves for and prints up to the Nth line of Pascal's Triangle.
//****************************************************************************************************************
public class PascalsTriangle
{
    // instance variables
    private int[][] T;
    /**
     * Constructor for objects of class PascalsTriangle. 
     * 
     * @param Requires an integer which determines the number of rows to solve for.
     */
    public PascalsTriangle(int rows)
    {
        // Populates the first array of a 2d array with the requested number of rows
        T = new int[rows][];
        
        // create array objects in each row with the growing numbers of columns, equal to the current row length
        for (int count = 0; count < T.length; count++)
        {
            T[count] = new int[count+1];
        }
        
        // invoke the private method solve
        solve();
    }
    
    /**
     * Solves the matrix by starting at the bottom-rightmost cell, solving for the value in that cell, then repeats that process
     * for each cell in each column of each row.
     * 
     * For each cell, solveCell is invoked which recursively solves for the specified cell's value, and then stores that value in said cell. 
     */
    private void solve()
    {
        for (int row = T.length-1; row >=0; row--)
        {    
            for (int col = T[row].length-1; col >= 0; col--)
                T[row][col] = solveCell(row, col);
        }
    }
    
    /**
     * Solves for the value of a single cell in the array. 
     * If the cell has the same row and column index, or if the cell is in the first column, it's value is a 1.
     * Otherwise, the value of a cell is equal to the sum of the two cells "above" it. I.e. the [row-1][col-1] cell and [row-1][col] cell.
     */
    private int solveCell(int row, int col)
    {    
        int result = 0;
        if (col == 0 || row == col)
            result = 1;
        else
            result = solveCell(row-1, col-1) + solveCell(row-1, col);
        return result;
    }
    
    /**
     * Prints the contents of the ragged array.
     */
    public String print()
    {
        String str = "";
        for (int row = 0; row < T.length; row++)
        {    
            for (int col = 0; col < T[row].length; col++)
                {
                     str += T[row][col] + "\t";
                }
            str += "\n";
        }
        return str;        
    }
}
