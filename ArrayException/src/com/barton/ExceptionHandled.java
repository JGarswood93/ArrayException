package com.barton;

public class ExceptionHandled {
    public static void main(String[] args) {
        //Array to add
        int marks[] = {40, 70, 87};
        System.out.println("Hello 1");
        //try this code
        try {


            int m1 = marks[0];
            int m2 = marks[1];
            int m3 = marks[2];
            System.out.println("Marks are " + m1);
            System.out.println("Marks are " + m2);
            System.out.println("Marks are " + m3);
        } catch (ArrayIndexOutOfBoundsException r) {


            System.out.println("Size of the Array musn't be increased " + r);
        }
        System.out.println("Hello2");
        System.out.println("Hello3");
    }

}


