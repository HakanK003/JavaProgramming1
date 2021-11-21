package day08_IfStatement;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        int number=101;

        boolean evenNumber = number%2==0;

        if (evenNumber){
            System.out.println(number + " is even number");
        }

        if (!evenNumber){
            System.out.println(number + " is odd number");
        }

/*
        if (number%2==0) {
            System.out.println("Odd Number");
        }
        if (number%2!=0) {
            System.out.println("Even Number");
        }
*/


        int n = 200;

        //positive
        if (n>0){   //if the n is greater then zero
            System.out.println(n + " is positive");
        }

        //negative
        if (n<0){    //if the n is smaller then zero
            System.out.println(n + " is negative");
        }

        if (n == 0){
            System.out.println(n + " is zero");
        }













    }





}
