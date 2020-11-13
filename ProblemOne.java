package com.company;

/**
 * Sum of the natural numbers below 1000
 * which can be divided by 3 or 5 without reminder
 * First problem of ProjectEuler.net
 *
 * @author Kerem ERDEN
 */

/*
Problem 1
Multiples of 3 and 5
If we list all the natural numbers below 10 that are multiples of 3 or 5,
we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class ProblemOne{

    public static int sumOfMultiples = 0 ;
    /**
     *Print sum on the screen
     */
    public static void main(String []args){
        for(int i = 0 ; i < 1000; i++){
            if (multipleOfThree(i)){
                sumOfMultiples += i;
            } else if (multipleOfFive(i)){
                sumOfMultiples += i;
            }
        }

        System.out.println(sumOfMultiples);
    }

    /**
     * Check if the number is multiple of three
     * @param n // natural number below 1000
     *
     * @return boolean true/false
     */

    public static boolean multipleOfThree(int n){
        return n % 3 == 0;
    }
    /**
     * Check if the number is multiple of five
     * @param n // natural number below 1000
     *
     * @return boolean true/false
     */

    public static boolean multipleOfFive(int n){
        return n % 5 == 0;
    }
}