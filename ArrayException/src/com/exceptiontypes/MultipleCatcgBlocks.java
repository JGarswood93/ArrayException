package com.exceptiontypes;

public class MultipleCatcgBlocks {
    public static void main(String[] args) {
        
        try {
            int a[]=new int [0];
            a[0]=6/0;
            System.out.println("First print statement in try block");
        } catch (ArrayIndexOutOfBoundsException y){//Array index exception
            System.out.println("Warning: ArrayIndexOutOfBoundsException");
        }
        catch (Exception t) {
            System.out.println("Warning: This is another exception");
        }
        System.out.println("Out of try-catch block...");

    }
}
