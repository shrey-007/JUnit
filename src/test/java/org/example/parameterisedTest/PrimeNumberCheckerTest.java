package org.example.parameterisedTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
//This annotation indicates that this test class is using parameterized tests, which means the test methods will be
// executed multiple times with different parameters.
public class PrimeNumberCheckerTest {
    private Integer inputNumber;
    private Boolean expectedResult;
    private PrimeNumberChecker primeNumberChecker;

    // constructor
    public PrimeNumberCheckerTest(Integer inputNumber, Boolean expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Before
    //this method runs before every test case
    public void initialize() {
        primeNumberChecker = new PrimeNumberChecker();
    }

    // A function which returns a Collection of numbers with answers whether they are prime or not
//    @Parameterized.Parameters provides the test data. This method is invoked by the JUnit framework itself, not
//    explicitly by your test code.
    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                { 2, true },
                { 6, false },
                { 19, true },
                { 22, false },
                { 23, true }
        });
    }

    @Test
    public void testPrimeNumberChecker() {
        System.out.println("Parameterized Number is : " + inputNumber);
        Assert.assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
    }

    // FLOW
//    Here's how the flow works:

//    When JUnit runs the test class PrimeNumberCheckerTest, it looks for methods annotated with @Parameterized.Parameters.
//    JUnit dynamically invokes the method primeNumbers() to get the test data.
//    The primeNumbers() method returns a Collection containing the test data.
//    JUnit then instantiates the test class PrimeNumberCheckerTest multiple times, each time passing in different parameters from the test data returned by primeNumbers().
//    For each instantiation, JUnit executes the test method testPrimeNumberChecker() with the specific set of parameters.
//    This process repeats for each set of parameters defined in the primeNumbers() method, allowing for parameterized testing.

}
