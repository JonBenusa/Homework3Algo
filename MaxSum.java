
/**
 * CISC 380
 * Algorithms Assignment 3 EXTRA CREDIT
 *
 *
 * Implements an iterative dynamic programming solution to find the subarray of maximum sum, of a given array of numbers.
 *
 * @author Tim Larson and Jonathan Benusa
 * Due Date: 03/27/22
 *
 */


public class MaxSum{

    /**
     * Returns the sum of the subarray with the maximum sum from the given array of integers.
     *
     *
     * @param a an array of integers
     * @return the sum of the subarray with the maximum sum.
     */
    public static int maxSumSubarray(int[] a){

        int maxSoFar = a[0];
        int[] maxAtIndex = new int[a.length];
        maxAtIndex[0] = maxSoFar;
        int solution = maxSoFar;
        for(int i = 0; i < a.length; i++){
            if((maxSoFar + a[i]) > a[i]){
                maxSoFar += a[i];
            } else{
                maxSoFar = a[i];
            }
            maxAtIndex[i] = maxSoFar;
            if(maxSoFar > solution){
                solution = maxSoFar;
            }
        }
        return solution;

    }//maxSubArray

}//class
