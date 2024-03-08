package org.example.exceptionsTest;

import java.io.FilterOutputStream;

public class Message {

//    JUnit provides an option of tracing the exception handling of code.
//    You can test whether the code throws a desired exception or not
    private String message;

    public Message(String message) {
        this.message = message;
    }
    public  void printMessage(){
        System.out.println(message);
        int a=0;
        int b=1/a;
        //this will give arithmetic exception
    }
    public  void printMessage2(){
        System.out.println(message);
    }
}
