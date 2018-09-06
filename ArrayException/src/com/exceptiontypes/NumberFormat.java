package com.exceptiontypes;

public class NumberFormat {
    public static void main(String[] args) {
        try {


            int i = Integer.parseInt("25k");
            System.out.println(i);
        } catch (NumberFormatException r){
            System.out.println("Exception is handled");

        }
    }
}