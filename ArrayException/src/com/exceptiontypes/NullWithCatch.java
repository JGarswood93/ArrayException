package com.exceptiontypes;

import java.lang.NullPointerException;

public class NullWithCatch {

    public static void main(String[] args) {
        String words = null;
        String[] wordArray = null;

        try {
            wordArray = words.split("\t");//what does this do
            try {
                for (String word : wordArray) {
                    System.out.println(word);
                }
            } catch (NullPointerException g) {
                System.out.println("Word array is null. NPE");
            }
        } catch (NullPointerException g) {
            System.out.println("words is holding null. NullPointerException is handled.");

        }
    }
}