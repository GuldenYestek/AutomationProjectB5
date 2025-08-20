package io.loop.test.SELENIUM.Java.JavaJava.Array;

public class SortArrayDemo {
    public static void main(String[] args) {
        int a []= {2,6,1,4,9};


        // 1,2,4,6, 9

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (a[i]> a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }





/*
        int a = 5;
        int b = 4;
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);


        //swap without variable

        a=a+b; //9
        b=a-b; // 5
        a=a-b;//4

*/



    }
}
