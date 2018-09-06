package com.barton;

public class Main {

    public static void main(String[] args) {
        try {
            int[] c = new int[5];
            System.out.println("Element 6 at index 5 = " + c[5]);
        } catch (ArrayIndexOutOfBoundsException r) {
            System.out.println("Exception thrown " + r);
        } finally {
            System.out.println("Finally finished try-carch");

        }
    }
}
