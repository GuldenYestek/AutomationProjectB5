package io.loop.test.SELENIUM.Java.JavaJava.constractor;

public class ConstructDemo {
//Default constructor
    public ConstructDemo(){
        System.out.println("I am in the constructor");
        System.out.println("I am in the constructor lecture 1");

    }
    //parameterize constructor

    public ConstructDemo(int a, int b){
        System.out.println("I am in the parameterize constructor");
        int c=a+b;
        System.out.println(c);
    }

    public ConstructDemo(String str){
        System.out.println(str);
    }
    public void getData(){
        System.out.println("I am the method");
    }

    public static void main(String[] args) {
       ConstructDemo cd = new ConstructDemo("hello");
        //ConstructDemo c = new ConstructDemo(4,5);
        // compile will call implicit constructor if you have not defined constructor
        //when ever you create an object constructor is called
        // block of code when ever an object is created



        //will not return value
        //name of constructor should be the class name



    }
}
