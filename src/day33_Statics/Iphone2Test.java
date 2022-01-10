package day33_Statics;

public class Iphone2Test {

    public static void main(String[] args) {

        Iphone2 iphone1 = new Iphone2("13Pro","Black","Big",899.99);

        iphone1.call();
        iphone1.faceTime();
        iphone1.text();

        System.out.println(iphone1);

    }

}
