package day10_NestedIf;

import java.util.Scanner;

public class OxygenTank {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your oxygen level (0~100)");
        int level= input.nextInt();

        String result = (level>=0&&level<=100)? (level>=90)? "Your tank is full":(level>=80)?"Still okay"
                        :(level>=70)?"Don't go too far" :(level>=60)? "Start to head back"
                        : "Be careful now you are at %50" : "Invalid oxygen level";
                        // better to say you are under %50 now and change 60 with 50
        System.out.println(result);

    }

}
/*
 Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at 50%

                USE ONE PRINT STATEMENT ONLY
 */