package day09_IfStatements;

public class MaxNumber2 {
    public static void main(String[] args) {

        int number1 = 33;
        int number2 = 320;

        if (number1>number2){
            System.out.println(number1 + " is the maximum number");
        }else if(number2 > number1){
            System.out.println(number2 + " is the maximum number");
        }else{
            System.out.println("Numbers are equal");
        }






    }
}

/*
     Write a program that can print the maximum number between two numbers, if both are equal then print Equal

            Ex:
                n1= 100, n2 = 200;

            output:
                200 is the maximum number
 */