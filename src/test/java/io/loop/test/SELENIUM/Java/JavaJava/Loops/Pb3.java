package io.loop.test.SELENIUM.Java.JavaJava.Loops;

public class Pb3 {
    public static void main(String[] args) {
        //nested loops works -
        int k = 1;

        for (int i = 1; i < 5; i++)// (outer for loop) this block will loop for 4 times
        {
            //System.out.println("outer loop started");
            for (int j = 1; j <= i; j++) // inner loop
            {
                System.out.print(k);
                System.out.print("\t");
                k++;
            }
            System.out.println("");
        }
    }
}

