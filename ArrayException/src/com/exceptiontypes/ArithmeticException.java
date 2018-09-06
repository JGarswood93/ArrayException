package com.exceptiontypes;

public class ArithmeticException extends Throwable {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            int c = a/b;
        }
        catch (java.lang.ArithmeticException e) {
            System.out.println("Canny do it lad");
        }
    }
}
