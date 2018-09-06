package com.barton;

public class ExceptionUnhandled {
    public static void main(String[] args) {
        int marks[] = {40, 70, 87};
        System.out.println("Hello 1");

        int m1 = marks[3];
        System.out.println("Marks are " + m1);

        System.out.println("Hello2");
        System.out.println("Hello3");
    }
}
