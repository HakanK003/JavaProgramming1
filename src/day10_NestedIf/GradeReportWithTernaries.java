package day10_NestedIf;

import java.util.Scanner;

public class GradeReportWithTernaries {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

            System.out.println("EnterScore");
            int s = input.nextInt();

            String result =  (s>=0&&s<=100)? (s>=90)? "Excellent" :(s>=80)? "Great" :(s>= 70)? "Good" :(s>=60)? "Passed":"Failed":"Invalid Score";

                             if (s>=0&&s<=100){

                                 if (s>=90){
                                     System.out.println("Excellent");
                                 }else if(s>=80){
                                     System.out.println("Great");
                                 }else if(s>= 70){
                                     System.out.println("Good");
                                 }else if(s>=60){
                                     System.out.println("Passed");
                                 }else{
                                     System.out.println("Failed");
                                 }

                             }else{
                                 System.out.println("Invalid Score");
                             }


            System.out.println(result);


            /*
                Combine them

                if(s>=0&&s<=100){
                              s>=90)? "Excellent" :(s>=80)? "Great"
                             :(s>= 70)? "Good" :(s>=60)? "Passed":"Failed"
                             }else
                             {result= "Invalid Score";}


             */





    }
}

/*
if (score>=90){
            System.out.println("Excellent");
        }else if(score>=80){
            System.out.println("Great");
        }else if(score>=70){
            System.out.println("Good");
        }else if(score>=60){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
 */