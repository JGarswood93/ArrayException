package com.exceptiontypes;

public class ArrayIOOBE {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Sherlock";
        names[1] = "mel";
        names[2] = "ant";
        System.out.println(names[0]);
        try {
            System.out.println(names[4]);//this can cause exception if it exceeds array
        } catch(ArrayIndexOutOfBoundsException t) {
            t.printStackTrace();//only works if it is outofbounds
            System.out.println("The index used is out of bounds");
        }
        System.out.println("The execution of other statements continues ");
    }
}
