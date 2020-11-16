package com.company;

/**
 * the largest palindrome made from the product of two 3-digit numbers.
 * Fourth problem of ProjectEuler.net
 *
 * @author Kerem ERDEN
 */

/*
Problem 4
Largest palindrome product
A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

public class ProblemFour {

    /**
     *Print sum on the screen
     */
    public static void main(String []args){
        System.out.println(largestPalindrome());
    }

    /**
     * Return the largest palindrome made from the product of two 3-digit numbers.
     *
     * @return largestPalindromeNumber
     */
    public static int largestPalindrome(){
        int largestPalindromeNumber =0 ;
        for(int firstNumber = 100 ; firstNumber < 1000 ; firstNumber++){
            for(int secondNumber = 100 ; secondNumber < 1000 ; secondNumber++){
                int numbersProduct = firstNumber * secondNumber ;
                if (palindromeCheck(numbersProduct) && numbersProduct > largestPalindromeNumber)
                    largestPalindromeNumber = numbersProduct;
            }
        }

        return largestPalindromeNumber;
    }
    /**
     * Check if a number palindrome number or not according to definition in the question
     * @param number  ---> product of two 3-digit numbers
     *                
     * @return boolean true/false
     */
    public static boolean palindromeCheck(int number ){
        String strNumber = String.valueOf(number);
        String reversedNumber = "";
        while(number >= 1){
            reversedNumber = reversedNumber + number % 10;
            number = number / 10;
        }
        return strNumber.equals(reversedNumber);
    }
}
