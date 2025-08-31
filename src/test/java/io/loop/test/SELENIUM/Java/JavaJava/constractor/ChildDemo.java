package io.loop.test.SELENIUM.Java.JavaJava.constractor;

public class ChildDemo extends ParentDemo {

   String name = "QAClickAcademy";

   public ChildDemo(){
       super(); // this should be always at first line
       System.out.println("child class constructor");
   }
    public void getStringData(){
        System.out.println(name);
        System.out.println(super.name);
    }

    public void getData(){

        super.getData();
        System.out.println("Im in the child class");
    }

    public static void main(String[] args) {

        ChildDemo cd = new ChildDemo();
        cd.getStringData();
        cd.getData();

    }
}
