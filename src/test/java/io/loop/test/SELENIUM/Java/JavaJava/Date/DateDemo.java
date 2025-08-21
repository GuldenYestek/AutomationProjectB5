package io.loop.test.SELENIUM.Java.JavaJava.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //current date... current time

        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        System.out.println(d.toString());
        System.out.println(sdf.format(d));


    }
}
