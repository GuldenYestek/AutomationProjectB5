package io.loop.test.SELENIUM.Java.JavaJava.String;

import java.util.ArrayList;

public class ReverseDemo {
    public static void main(String[] args) {

        String s = "rahul";
        String t = "";
        for (int i = s.length()-1; i>=0; i--)
        {
            System.out.println(s.charAt(i));
            t = t + s.charAt(i);
            if(s==t)
            {
                System.out.println(t);
            }


        }

    }
}
