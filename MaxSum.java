
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

        if(a.length <= 0){
            return 0;   // for case when input size is 0
        }
        int[] maxAtIndex = new int[a.length];
        maxAtIndex[0] = a[0];
        int solution = maxAtIndex[0];
        for(int i = 1; i < a.length; i++){
            if((maxAtIndex[i-1] + a[i]) > a[i]){
                maxAtIndex[i] = maxAtIndex[i-1] + a[i];
            } else{
                maxAtIndex[i] = a[i];
            }
            if(maxAtIndex[i] > solution){
                solution = maxAtIndex[i];
            }
        }
        return solution;

    }//maxSubArray

}//class
