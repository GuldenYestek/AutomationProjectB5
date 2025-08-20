package io.loop.test.SELENIUM.Java.JavaJava.Loops;

public class Pb4 {
    public static void main(String[] args) {
        //nested loops works -


        for (int i = 1; i < 5; i++)// (outer for loop) this block will loop for 4 times
        {
            //System.out.println("outer loop started");
            for (int j = 1; j <= i; j++) // inner loop
            {
                System.out.print(j);
                System.out.print("\t");

            }
            System.out.println("");
        }
    }
}

