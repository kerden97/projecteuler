package com.company;

/**
 * largest prime factor of the number 600851475143
 * Third problem of ProjectEuler.net
 *
 * @author Kerem ERDEN
 */

/*
Problem 3
Largest prime factor
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/

public class ProblemThree{

    /**
     *Print the largest prime factor to screen
     */
    public static void main(String []args){
        System.out.println(factorCheck(600851475143L));
    }

    /**
     * Return the biggest prime factor of given long number
     * @param n // a long number as a parameter
     *
     * @return biggestPrimeFactor
     */

    public static long factorCheck(long n){
        /* for int n = 100 , when we divide n by 2 it is equal 50 which means there is no bigger integer than 50 can
         divide n without reminder. So , it can be useful approach to boost speed of execution. I decreased the limit
         after every factor (not necessarily prime factor but only factor). For example , for number 600851475143 it
         is first prime factor is 71 and 600851475143/71 = 8462696833 , which means there is no bigger number
         than 8462696833 can divide 600851475143 without reminder. According to this , number of iteration decreased and
         it affects runtime */
        long limit = n;
        long biggestPrimeFactor = 0 ;
        for(long i = 3; i<limit; i=i+2){ //like this we will just check odd factor , The only even prime number is 2.
            if (n % i == 0 && primeCheck(i)){
                biggestPrimeFactor = i;
                limit = n/i;
            }
        }
        return biggestPrimeFactor;
    }
    /**
     * Check if a factor is a prime number or not
     * @param factor // the factor of the given number
     *
     * @return boolean true/false
     */

    public static boolean primeCheck(long factor){
        for(long i = 3; i< (factor/2) +1; i=i+2)
            if (factor % i == 0) {
                return false;
            }
        return true;
    }
}