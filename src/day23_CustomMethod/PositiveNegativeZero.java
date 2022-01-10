package day23_CustomMethod;

import java.util.Scanner;

public class PositiveNegativeZero {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();
        input.close();

        PosNegZero(number);

    }

    public static void PosNegZero(int num){

        String result = (num>0)? "Positive" :(num<0)? "Negative" : "Zero";
        System.out.println(result);

    }

}

/*
create a method that can if the given integer is positive, negative or zero
 */