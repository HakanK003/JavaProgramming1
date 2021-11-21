package day10_NestedIf;

import java.util.Scanner;

public class CampusTime {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter time (like 1~24)");
        int time = input.nextInt();

        String result;

        if (time>=1 && time<=24)
            {
            if (time>=8 && time<=23) {result="Campus is Open";}
                else {result="Campus is Closed";}
            }
            else {result="What the ???";}


        System.out.println(result);


    }
}

/*
Create a class called CampusTime,
an integer variable named time is given with a number between 1~24 has been initialized,
write a program that can find out if the campus is open or not.
Campus is open from 8 am(8) to 11 pm (23) If user enters a time within the open time they should see message:
“open”  but if the time entered is outside of operating hours they should see: “ closed”
 */