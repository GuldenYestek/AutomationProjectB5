package io.loop.test.SELENIUM.Java.JavaJava.String;

public class StringDemo {
    public static void main(String[] args) {

        String a = "hello";
        String b = "hello";
        String c = a.concat("World");
        System.out.println(a);
        String s = new String("hello");
        String s1 = new String("hello");

        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(a.equals(s));
        System.out.println(a == s);
        System.out.println(a == s1);
        //StringBuffer and StringBuilder - Mutable

        StringBuffer sb = new StringBuffer("hello");
        sb.append("world");
        System.out.println(sb);
        sb.insert(2, "She");
        System.out.println(sb);
        sb.replace(5,7, "aa");
        System.out.println(sb);
        sb.deleteCharAt(12);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        StringBuilder sbb = new StringBuilder("hello");


        //StringBuilder is not thread safe. It is Non Synchronize, it is faster

    }

}
