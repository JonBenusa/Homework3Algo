/**
 * CISC 380
 * Algorithms Assignment 3
 *
 * Implements a dynamic programming solution to the Interleaving Strings problem.
 * 
 * @author YOUR NAME HERE
 * Due Date: xx/xx/xx
 */

public class Interleaver{

    
    public Interleaver(){
        //YOUR CODE HERE

       
    }//constructor

    /**
     * Finds if the two strings x and y are an interleaving of string z
     * 
     * The string Z is an interleaving of X and Y if it can be obtained
     * by interleaving the characters in X and Y in a way that
     * maintains the left-to-right order of the c in X and Y:
     * 
     * @param x the first string that composes an interleaving
     * @param y the second string that composes an interleaving
     * @param z the string to check for an interleaving
     * @return True, if the string z is an interleaving of x and y. False otherwise.
     * 
     */
    public Boolean isInterleaved(String x, String y, String z){

        //YOUR CODE HERE  

        return false;

    }//isInterleaved

    /**
     * Returns a string representation of the solution of the interleaved string problem.
     * 
     * The return value is a string whose length is equal to z. 
     * All characters in z are replaced by character "x" if they come from the string "x",
     * and all characters in z are replaced by the character "y" if they come from the string y.
     * 
     * For example, on an input of x = "ab", y = "cd", and z = "abcd", then the output shall be the string "xxyy".
     * 
     * @param x the first string that composes an interleaving
     * @param y the second string that composes an interleaving
     * @param z the string to check for an interleaving
     * @return A string representation of the solution
     */
    public String getSolution(String x, String y, String z){

        //YOUR CODE HERE

        return null;

    }

}//class