##
#  Sum of the Even Fibonacci number below n
#  Second problem of ProjectEuler.net
#
#  @author Kerem ERDEN


# sum of even fibonnaci numbers in a fibonnaci series limited by given integer
#  @param integer n (limit of the fibonnaci series)
#
#  @return an integer number which represent sum of even fibonnaci numbers
def sumOfEvenFibonnaci(n):
    firstNumber = 1
    secondNumber = 2
    sumOfEvens = 2  # because second number is already a even number in a fibonnaci series
    if n == 0 or n == 1:
        return 0

    while secondNumber <= n:
        nextNumber = firstNumber + secondNumber
        firstNumber = secondNumber
        secondNumber = nextNumber

        if secondNumber % 2 == 0:
            sumOfEvens += secondNumber

    return sumOfEvens
