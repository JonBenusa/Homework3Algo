
/**
 * CISC 380
 * Algorithms Assignment 3
 * <p>
 * Implements a dynamic programming solution to the Interleaving Strings problem.
 *
 * @author Jonathan Benusa
 * Due Date: xx/xx/xx
 */

public class Interleaver {


    public Interleaver() {
        //YOUR CODE HERE


    }//constructor

    /**
     * Finds if the two strings x and y are an interleaving of string z
     * <p>
     * The string Z is an interleaving of X and Y if it can be obtained
     * by interleaving the characters in X and Y in a way that
     * maintains the left-to-right order of the c in X and Y:
     *
     * @param x the first string that composes an interleaving
     * @param y the second string that composes an interleaving
     * @param z the string to check for an interleaving
     * @return True, if the string z is an interleaving of x and y. False otherwise.
     */
    public Boolean isInterleaved(String x, String y, String z) {
        int i;
        int j;

        //if any of the strings are null then return false
        if (z == null || x == null || y == null) {
            return true;
        }

        i = x.length();
        j = y.length();
        //if the length of x plus the length of y is not equal to the length of z we know it can't be interleaved
        if (i + j != z.length()) {
            return false;
        }

        //if either x or y have no more characters then z must be equal to the one that still has some characters
        if (x.isEmpty()) {
            if (y.equals(z)) {
                return true;
            } else {
                return false;
            }
        }
        if (y.isEmpty()) {
            if (x.equals(z)) {
                return true;
            } else {
                return false;
            }
        }

        //Recursive calls:

        //if the last character in z is equal to the last character in both then recurse on both.
        if (z.charAt(i + j-1) == x.charAt(i-1) && z.charAt(i + j-1) == y.charAt(j-1)) {
            //if either path shows that they are interleaved then return true.
            if (isInterleaved(x.substring(0, i - 1), y, z.substring(0, i + j - 1)) || isInterleaved(x, y.substring(0, j - 1), z.substring(0, i + j - 1))) {
                return true;
            } else {
                return false;
            }
            //if the last character in z is equal to only one of them then recurse on only the one
        } else if (z.charAt(i + j - 1) == x.charAt(i - 1)) {
            return isInterleaved(x.substring(0, i - 1), y, z.substring(0, i + j - 1));
        } else if (z.charAt(i + j - 1) == y.charAt(j - 1)) {
            return isInterleaved(x, y.substring(0, j - 1), z.substring(0, i + j - 1));
        }
        //if none of them are equal then this is not interleaved
        return false;

    }//isInterleaved

    /**
     * Returns a string representation of the solution of the interleaved string problem.
     * <p>
     * The return value is a string whose length is equal to z.
     * All characters in z are replaced by character "x" if they come from the string "x",
     * and all characters in z are replaced by the character "y" if they come from the string y.
     * <p>
     * For example, on an input of x = "ab", y = "cd", and z = "abcd", then the output shall be the string "xxyy".
     *
     * @param x the first string that composes an interleaving
     * @param y the second string that composes an interleaving
     * @param z the string to check for an interleaving
     * @return A string representation of the solution
     */
    public String getSolution(String x, String y, String z) {

        //YOUR CODE HERE

        return null;

    }

}//class