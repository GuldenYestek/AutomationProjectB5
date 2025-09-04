package io.loop.test.SELENIUM.Java.JavaJava.variables;

public class StaticVar {

    String name; //instance variables
    String address;
    static String city = "Bangalore"; // class variables
     static int i = 0;
     static {
         city = "Banglore";
         i=0;
     }


    StaticVar(String name, String address) {

       this.name=name;
       this.address=address;
       i++;
        System.out.println(i);

    }

    public void getAddress() {
        System.out.println(address + " " + city);

    }
    public static void getCity(){
        System.out.println(city);
    }

    public static void main(String[] args) {
        StaticVar obj = new StaticVar("Bob", "Marthalli");
        StaticVar obj1 = new StaticVar("Ram", "Jayangar");
        StaticVar obj2 = new StaticVar("Kol", "Marthalli");
        obj.getAddress();
        obj1.getAddress();
        StaticVar.getCity();
        StaticVar.i=4;
        obj.address="XYZ";

    }
}
