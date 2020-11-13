##
#  Sum of the natural numbers below 1000
#  which can be divided by 3 or 5 without reminder
#  First problem of ProjectEuler.net
#  @author Kerem ERDEN


#  Calculate the sum of numbers divisible by 3 or 5 in range n
#  @param integer n
#
#  @return sum
def sumOfDigits(n):
    total = 0  # accumulator
    for i in range(1, n):
        if divisibleByThree(i) or divisibleByFive(i):
            total += i
    return total


#  Check If number divisible by 3
#  @param integer n
#
#  @return boolean true/false
def divisibleByThree(n):
    return n % 3 == 0


#  Check If number divisible by 5
#  @param integer n
#
#  @return boolean true/false
def divisibleByFive(n):
    return n % 5 == 0
