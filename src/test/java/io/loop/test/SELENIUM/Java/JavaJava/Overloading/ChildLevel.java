package io.loop.test.SELENIUM.Java.JavaJava.Overloading;

import io.loop.test.SELENIUM.Java.JavaJava.interf.ChildClassDemo;

public class ChildLevel extends ChildClassDemo {

    public void getData(int a) {
        System.out.println(a);
    }

    public void getData(String a) {
        System.out.println(a);
    }

    public void getData(int a, int b) {
        System.out.println(b);
    }

    public static void main(String[] args) {
        ChildLevel cl = new ChildLevel();
        cl.getData(2);
        cl.getData("hello");
        cl.getData(2,5);

    }
}

