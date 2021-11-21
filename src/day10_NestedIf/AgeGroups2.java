package day10_NestedIf;

import java.util.Scanner;

public class AgeGroups2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        input.close();

        String result = (age>=0&&age<=150)? (age<21)? "Teenager" :(age<55)? "Adult" : "Senior" : "Invalid";

        System.out.println(result);


    }
}

/*
Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */