package day10_NestedIf;

import java.util.Scanner;

public class GradeLevel {
                                                    //HK003
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Please enter grade (1~18)");
        byte grade = input.nextByte();

        String result =(grade>=1&&grade<=18)? (grade>=17)? "Grad School" :(grade>=13)? "Collage"
                       :(grade>=9)? "High School" :(grade>=6)? "Middle School" : "Elementary School" :"Invalid Grade";


        System.out.println(result);

    }
}

/*
Create a class called GradeLevel,
Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */