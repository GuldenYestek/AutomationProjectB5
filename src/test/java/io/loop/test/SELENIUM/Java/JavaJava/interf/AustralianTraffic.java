package io.loop.test.SELENIUM.Java.JavaJava.interf;

public class AustralianTraffic implements CentralTraffic,ContinentalTraffic {

    public static void main(String[] args) {
        CentralTraffic a= new AustralianTraffic();
        a.redStop();
        a.FlashYellow();
        a.greenGo();

        AustralianTraffic at=new AustralianTraffic();
        ContinentalTraffic ct=new AustralianTraffic();
        at.walkonsymbol();
        ct.Trainsymbol();


    }

    @Override
    public void redStop() {

        System.out.println(" redstop implementation");
    }
    public void walkonsymbol()
    {
        System.out.println("walking");
    }
    @Override
    public void FlashYellow() {

        System.out.println(" flash yellow implementation");
//code
    }

    @Override
    public void greenGo() {

        System.out.println(" Green go implementation");
    }

    @Override
    public void Trainsymbol() {


    }

}