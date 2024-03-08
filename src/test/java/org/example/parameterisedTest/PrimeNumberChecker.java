package org.example.parameterisedTest;

public class PrimeNumberChecker {
    // A function to check whether a number a prime or not and returna a boolean if true else return false
    public Boolean validate(final Integer primeNumber) {
        for (int i = 2; i < (primeNumber / 2); i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
