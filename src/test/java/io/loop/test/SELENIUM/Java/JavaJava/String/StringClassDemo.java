package io.loop.test.SELENIUM.Java.JavaJava.String;

import java.util.Locale;

public class StringClassDemo {
    public static void main(String[] args) {
        // String; it is one of the prebuilt class in java
       /*
        1. String literal
        2. by creating object of string
        */

        String a = " javatraining"; // string literal

        System.out.println(a.charAt(2));
        System.out.println(a.indexOf("e"));
        System.out.println(a.substring(3, 6));
        System.out.println(a.substring((5)));
        System.out.println(a.concat("rahul teaches"));
        System.out.println(a.trim());
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
       String arr [] = (a.split("t"));
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(a.replace("t", "s"));


    }
}
