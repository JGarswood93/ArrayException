package com.exceptiontypes;

public class StringIndexOutOfBounds {

    public static void main(String[] args) {
        String str = "Learning Java I wish was easy" ;
        System.out.println("Length of str is : " + str.length());
        String strPart1 = str.substring(0,13);
        System.out.println("strPart1: " +strPart1);
        String strPart2 = str.substring(14,36);
        System.out.println("strPart2 : " +strPart2);
    }
}
