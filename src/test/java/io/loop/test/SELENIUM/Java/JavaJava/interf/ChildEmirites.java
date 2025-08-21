package io.loop.test.SELENIUM.Java.JavaJava.interf;

public class ChildEmirites extends ParentAirCraft {
    public static void main(String[] args) {

        ChildEmirites c = new ChildEmirites();
        c.engine();
        c.bodyColor();
        c.engine();

       // ParentAirCraft p = new ParentAirCraft();


        }

    @Override
    public void bodyColor() {
        System.out.println("red color on the body");

    }
}
