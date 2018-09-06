package com.exceptiontypes;

import java.lang.NullPointerException;

public class TestFinally {
    public static void main(String[] args) {
        try {
            int data = 25 % 2;
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block is executed ");
            System.out.println("rest of code, assuming the exceptions didn't occur");
        }
    }
}