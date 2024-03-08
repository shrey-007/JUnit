package org.example.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
//@RunWith(Suite.class) tells JUnit to run this class as a suite.
//@Suite.SuiteClasses({TestClass1.class, TestClass2.class, TestClass3.class}) specifies an array of test classes to include in the suite.
@Suite.SuiteClasses({
        TestClass1.class,
        TestClass2.class,
        TestClass3.class
})
public class TestSuite {
    // This class doesn't need to have any code.
    // You need to implement TestClass 1,2,3
    // In JUnit 4, a test suite allows you to group multiple test cases into a single test suite and run them together.
    // This can be helpful when you have a set of related tests that you want to execute together.

}

