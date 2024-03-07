package org.example.services;

import org.junit.*;

public class CalculatorServiceTest {

//    This method is annoted with BeforeClass so it is the first method which will run
    @BeforeClass
    public static void init(){
        System.out.println("Testing test cases");
        System.out.println("This method is annoted with BeforeClass so it is the first method which will run");
    }

    //test method of addTwoNumbers
    //use the same name and append Test
    // to declare any method to test, we use @Test
    @Test
    public void addTwoNumbersTest(){
        int result=CalculatorService.addTwoNumbers(12,45);
        int expected=57;
        Assert.assertEquals(expected,result);
    }

    @Test(timeout = 2000)
    //this test will fail if it doesn't ends within 2 seconds
    public void sumAnyNumberTest(){
        int result=CalculatorService.sumAnyNumber(2,7,8,9);

        int expected=26;
        Assert.assertEquals(expected,result);
    }

    @AfterClass
    public static void cleanup(){
        System.out.println("End of all test cases");
    }

    @Before
    //This method will run before eac Test Case
    public void beforeEachTestCase(){
        System.out.println("This method will run before each Test Case");
    }
    @After
    //This method will run after eac Test Case
    public void afterEachTestCase(){
        System.out.println("This method will run after each Test Case");
    }



}
