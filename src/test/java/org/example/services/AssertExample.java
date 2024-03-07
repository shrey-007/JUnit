package org.example.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertExample {
      // Assertion means validating actual result with expected result
    @Test
    public void test1(){
        System.out.println("Testing some assertions methods");
        int actual=12;
        int expected=12;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void test2(){
        System.out.println("Testing some assertions methods");
        int [] actual={1,2,3,4,5};
        int expected[]={1,2,3,4,5};
//        Assertions.assertEquals(expected,actual);
//        dont compare it using assertEquals kiuki usme voh object ka hashcode compare kr rha hai
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void test3(){
        System.out.println("Testing some assertions methods");
        String actual=new String("Shrey");
        String expected=new String("Shrey");
        // assertSame checks whether both objects are same or not, since uper dono strings ke alag object hoge toh assertSame fail ho jaaega
//        Assertions.assertSame(expected,actual);

        Assertions.assertEquals(expected,actual);
    }

}
