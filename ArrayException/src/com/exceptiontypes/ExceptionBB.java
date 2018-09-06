package com.exceptiontypes;

public class ExceptionBB {
    public static void main(String[] args) {
        double num1, num2;// variables are initialised here but with no value
        try { //try this block-dodgy maths.
            num1 = 3;
            num2 = 62 / num1;//canny do it
            System.out.println(num2);
            System.out.println("Hey I'm at the end of the block");
        }
        catch (java.lang.ArithmeticException e) {//catch the exception when it occurs
            System.out.println("Numbers can't be divided by zero");
        }
        catch (Exception t) {//when a number hasn't been given
            System.out.println("Exception occurred");
        }
        System.out.println("I'm out of the block");
    }
}
