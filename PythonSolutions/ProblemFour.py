##
#  the largest palindrome made from the product of two 3-digit numbers.
#  Fourth problem of ProjectEuler.net
#
#  @author Kerem ERDEN


# A palindromic number reads the same both ways. The largest palindrome
# made from the product of two 2-digit numbers is 9009 = 91 × 99.

#  Return the largest palindrome made from the product of two 3-digit numbers.
#
#  @return largestPalindromeNumber
def largestPalindrome():
    largestPalindromeNumber = 0
    for firstNumber in range(100, 1000):  # 1000 is exclusive , 3-digit numbers only
        for secondNumber in range(100, 1000):
            numbersProduct = firstNumber * secondNumber
            if palindromeCheck(numbersProduct) and numbersProduct > largestPalindromeNumber:
                largestPalindromeNumber = numbersProduct

    return largestPalindromeNumber


#  Check if a number palindrome number or not according to definition in the question
#  @param number // product of two 3-digit numbers
#
#  @return boolean True | False
def palindromeCheck(number):
    strNumber = str(number)
    return strNumber == strNumber[::-1]
