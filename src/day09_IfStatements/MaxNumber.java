package day09_IfStatements;

public class MaxNumber {

    public static void main(String[] args) {

        int number1=330;
        int number2=33;

        if(number1!=number2) {
            if (number1 > number2) {
                System.out.println("Maximum number is number1: " + number1);
            } else {
                System.out.println("Maximum number is number2: " + number2);
            }
        }
    }
}

/*
Maximum number between two different numbers
 */