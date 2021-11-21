package day10_NestedIf;

import java.util.Scanner;

public class NumberOfDays {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter Number Of Month");
        int month = input.nextInt();

        String result;


        if(month>=1&&month<=12){

            if (month ==1)  { result = "January has 31 days";}else
            if (month ==2)  { result = "February has 28 days";}else
            if (month ==3)  { result = "March has 31 days";}else
            if (month ==4)  { result = "April has 30 days";}else
            if (month ==5)  { result = "May has 31 days";}else
            if (month ==6)  { result = "June has 30 days";}else
            if (month ==7)  { result = "July has 31 days";}else
            if (month ==8)  { result = "August has 31 days";}else
            if (month ==9)  { result = "September has 30 days";}else
            if (month ==10) { result = "October has 31 days";}else
            if (month ==11) { result = "November has 30 days";}else
                            { result = "December has 31 days";}
        }else {
            result = "Invalid number! Please try with another number.";
        }

        System.out.println(result);

    }

}
/*
Create a class named NumberOfDays, an integer variable named month that has numbers 1 ~12 is given to you, write a program that can find the number of days in the given number of month.

            EX:
                month = 5

            output:
                31 days

            (Assume that February has 28 days)
 */