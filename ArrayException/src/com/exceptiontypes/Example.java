package com.exceptiontypes;

public class Example {
//showing how you can call exceptions
    public static void main(String[] args) {
        //should this occur
        try{
            int num=121/0;
            System.out.println(num);
        }
        //this exception thrown
        //finally will always execute despite no exceptions
        finally {
            System.out.println("Finally block here");
        }
       System.out.println("Out of try and catch");
    }
}
