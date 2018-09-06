package com.exceptiontypes;

public class Finally {

    public static void main(String[] args) {
        System.out.println(Finally.myMethod());//calling class to a method
    }

    private static int myMethod() {
        try {//try returning number

            return 112;
        } finally {
            System.out.println("This is Finally block");

            System.out.println("Finally block ran even after return statement");
        }
    }
}
