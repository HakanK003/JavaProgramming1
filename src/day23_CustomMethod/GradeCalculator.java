package day23_CustomMethod;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");
        int score = input.nextInt();

        input.close();

        gradeCalculator(score);



    }

    public static void gradeCalculator(int score){

        char grade = (score>=90)? 'A' :(score>=80)? 'B' :(score>=70)? 'C' :(score>=60)? 'D' : 'F';
        System.out.println("Your grade is " + grade);
    }
}

/*
create a method that can calculate the grade of the student based on the score
 */