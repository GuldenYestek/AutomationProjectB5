package io.loop.test.SELENIUM.Java.JavaJava.interf;

public class ChildClassDemo extends ParentClassDemo {

 public void AudioSystem() {
     System.out.println("new audio child");
 }
    public void engine() {
        System.out.println("new engine");
    }

    public void color() {
        System.out.println(color);
    }

    public static void main(String[] args) {
        ChildClassDemo cd = new ChildClassDemo();
        cd.color();
        cd.Brakes();
        cd.AudioSystem();

    }
}



