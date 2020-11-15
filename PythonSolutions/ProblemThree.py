##
#  largest prime factor of the number 600851475143
#  Third problem of ProjectEuler.net
#
#  @author Kerem ERDEN


#  Return the biggest prime factor of given long number
#  @param n // a number
#
#  @return biggestPrimeFactor
def factorCheck(n):
    # for int n = 100 , when we divide n by 2 it is equal 50 which means there is no bigger integer than 50 can
    # divide n without reminder. So , it can be useful approach to boost speed of execution. I decreased the limit
    # after every factor (not necessarily prime factor but only factor). For example , for number 600851475143 it
    # is first prime factor is 71 and 600851475143/71 = 8462696833 , which means there is no bigger number
    # than 8462696833 can divide 600851475143 without reminder. According to this , number of iteration decreased and
    # it affects runtime
    limit = n
    biggestPrimeFactor = 0
    i = 3  # will just check odd factor , The only even prime number is 2.
    while i < limit:
        i += 2
        if n % i == 0 and primeCheck(i):
            biggestPrimeFactor = i
            limit = n / i

    return biggestPrimeFactor


#  Check if a factor is a prime number or not
#  @param factor // the factor of the given number
#
#  @return boolean True/False
def primeCheck(factor):
    i = 3
    while i <= factor / 2:
        i += 2
        if factor % i == 0:
            return False
    return True

