package day23_CustomMethod;

import java.util.Scanner;

public class EligibleAlcohol {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        eligibleToBuyAlcohol(age);


    }

    public static void eligibleToBuyAlcohol(int age){
        if (age>=18){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("You aren't eligible to buy alcohol");
        }
    }
}

/*
create a method that can check if a person is eligible to buy alcohol
 */