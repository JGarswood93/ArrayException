package com.exceptiontypes;

import java.lang.NullPointerException;

public class ExceptionOccursNoHandle {
    public static void main(String[] args) {
        try{
            int data=25/0;//if divided by zero throws exception
            System.out.println(data);
        }
        catch(NullPointerException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code");
    }
}
