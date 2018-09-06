package com.exceptiontypes;

public class NumberFormatThrows {
    public static void main(String[] args) {
        try {
            new NumberFormatThrows().intParsingMethod();
        } catch (NumberFormatException n) {
            System.out.println("NumberFormatException handled");
        }
    }
    public void intParsingMethod() throws  NumberFormatException{
        int i = Integer.parseInt("25k");
        System.out.println(i);
    }
}
