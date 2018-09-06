package com.exceptiontypes;

public class ArrayStoreException {
    public static void main(String[] args) {
        Object[] names = new Float[1];
        try {


        names[0] = new Integer(0);
        } catch (java.lang.ArrayStoreException g) {
            g.printStackTrace();
            System.out.println("The stack trace has been printed for logging ");
            System.out.println("Array store is handled");
        }
        System.out.println("Continue");
    }
}
