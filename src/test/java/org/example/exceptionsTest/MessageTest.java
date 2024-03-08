package org.example.exceptionsTest;

import org.junit.Test;

public class MessageTest {
    Message message=new Message("Hello Shrey!!");

    // agar direcly run krdoge toh jisme exception aa rhi hai vo test cae fail ho jaaega
    // but agar @Test(expected = ArithmeticException.class) kiya toh isme exception aayi toh ye paas ho jaaega kiuki
    // saaf saaf likha hai ki exception aani chaiye toh expected meets reality toh passed.

    @Test(expected = ArithmeticException.class)
    public void testPrintMessage(){
        message.printMessage();
    }
    @Test
    public void testPrintMessage2(){
        message.printMessage2();
    }
}
