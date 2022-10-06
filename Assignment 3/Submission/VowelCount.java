
//*****************************************************************************************
// VowelCount.java            Module 4 Conditions and Loops
//
// Michael Kuby T00700593
// COMP 1131 Assignment 3: Conditions and Loops
// Question 2
//
// Version 1.0
//
// Reads a string from the user, then determines and displays how many (of each) of the
// five vowels (a, e, i, o, and u) appear in the entire string. Each vowel is counted
// separately, as are consonants, spaces, all other characters, as well as total characters. 
// Both upper and lower-case are accounted for.
//*****************************************************************************************

import java.util.Scanner;

public class VowelCount
{
    public static void main (String[] args)
    {
        char analyzeAgain;
        
        do
        {
            // Ready the program to accept input from the user, and scan the user's input.
            Scanner keyboard, inputScan;
            keyboard = new Scanner (System.in);
            String input;
            
            // Notify the user about how the program works, and prompt them to input data for analysis.
            System.out.println ("The following returns a variety of information regarding " 
                              + " the characters input.");
            System.out.println ("Enter a string of characters, such as a word, phrase, or quote:");
            input = keyboard.nextLine().toUpperCase();
            
            // Scan and analyze the user's input for individual vowels, consonants, spaces, other characters, and total characters.
            int i = 0;
            int vowelA = 0, vowelE = 0, vowelI = 0, vowelO = 0, vowelU = 0, consonant = 0, spaces = 0, otherChar = 0, total = 0;
            
            for (input.charAt(i); i <= input.length()-1; i++)
            {
                switch (input.charAt(i))
                {
                    case 'A':
                        vowelA++;
                        total++;
                        break;
                    case 'E':
                        vowelE++;
                        total++;
                        break;
                    case 'I':
                        vowelI++;
                        total++;
                        break;
                    case 'O':
                        vowelO++;
                        total++;
                        break;
                    case 'U':
                        vowelU++;
                        total++;
                        break;
                    case 'B':
                        consonant++;
                        total++;
                        break;
                    case 'C':
                        consonant++;
                        total++;
                        break;
                    case 'D':
                        consonant++;
                        total++;
                        break;
                    case 'F':
                        consonant++;
                        total++;
                        break;
                    case 'G':
                        consonant++;
                        total++;
                        break;
                    case 'H':
                        consonant++;
                        total++;
                        break;
                    case 'J':
                        consonant++;
                        total++;
                        break;
                    case 'K':
                        consonant++;
                        total++;
                        break;
                    case 'L':
                        consonant++;
                        total++;
                        break;
                    case 'M':
                        consonant++;
                        total++;
                        break;
                    case 'N':
                        consonant++;
                        total++;
                        break;
                    case 'P':
                        consonant++;
                        total++;
                        break;
                    case 'Q':
                        consonant++;
                        total++;
                        break;
                    case 'R':
                        consonant++;
                        total++;
                        break;
                    case 'S':
                        consonant++;
                        total++;
                        break;
                    case 'T':
                        consonant++;
                        total++;
                        break;
                    case 'V':
                        consonant++;
                        total++;
                        break;
                    case 'W':
                        consonant++;
                        total++;
                        break;
                    case 'X':
                        consonant++;
                        total++;
                        break;
                    case 'Y':
                        consonant++;
                        total++;
                        break;
                    case 'Z':
                        consonant++;
                        total++;
                        break;
                    case ' ':
                        spaces++;
                        total++;
                        break;
                    default:
                        otherChar++;
                        total++;
                        break;
                }
            }
            // Display the analysis of the character input to the user.
            
            System.out.println ("\nThe string contains: ");
            
            System.out.print ("\nA's: " + vowelA);
            System.out.print ("\t\tE's: " + vowelE);
            System.out.print ("\t\tI's: " + vowelI);
            System.out.print ("\t\tO's: " + vowelO);
            System.out.println ("\t\tU's: " + vowelU);
            
            System.out.print ("\nConsonants: " + consonant);
            System.out.print ("\nSpaces: " + spaces);
            System.out.print ("\nAll other characters: " + otherChar);
            System.out.println ("\nTotal characters: " + total);
            
        
            // Prompt the user if they want to analyze another string of input, or shut down the program.
            System.out.print ("\nAnalyze another (Y/N)? ");

            String analyzeAnother = keyboard.nextLine().trim().toUpperCase();
            analyzeAgain = analyzeAnother.charAt(0);
            
            System.out.println ();
        }
        while (analyzeAgain == 'Y');
        }
}        