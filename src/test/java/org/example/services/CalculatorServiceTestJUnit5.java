package org.example.services;

import org.junit.jupiter.api.*;

public class CalculatorServiceTestJUnit5 {
    @BeforeAll
    //It is same as @BeforeClass
    public static void init(){
        System.out.println("init");
    }

    @AfterAll
    //same as @AfterClass
    public static void cleanup(){
        System.out.println("cleanup");
    }

    @BeforeEach
    public void beforeEachTestCae(){
        System.out.println("ye har test case chalne se pehle ye chalega");
    }
    @AfterEach
    public void afterEachTestCae(){
        System.out.println("ye har test case chalne ke baad ye chalega");
    }
    @Test
    public void addTwoNumberTest(){
        int reality=CalculatorService.addTwoNumbers(12,12);
        int expectation=24;
        Assertions.assertEquals(reality,expectation,"Test Failed");
    }
    @Test
    public void addAnyNumberTest(){
        int reality=CalculatorService.sumAnyNumber(12,1,2,3);
        int expectation=18;
        Assertions.assertEquals(expectation,reality);
    }

    //More Annotations
    /*
    *  @DisplayName("Test1") : To give a name to a testcase
    *  @Disabled/@Ignore : To ignore a test case (we can put this annotation at method level toh voh method nhi chalega or we can put it on class level toh us class ke saare methods nhi chalege)
    *  @Tag
    *  @Nested
    *  @TestFactory
    * */

    //Test suite is used to bundle a few unit test cases and run them together. In JUnit, both @RunWith and @Suite
    // annotations are used to run the suite tests.
}
