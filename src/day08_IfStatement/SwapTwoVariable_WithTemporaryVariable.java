package day08_IfStatement;

public class SwapTwoVariable_WithTemporaryVariable {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
/*
        b = a;  boyle olmaz
        a = b;
 */

        int c = b;   //contains the value of b
        b = a;
        a = c;



        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }


}
