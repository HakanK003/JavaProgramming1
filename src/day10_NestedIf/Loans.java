package day10_NestedIf;

import java.util.Scanner;

public class Loans {

    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

        System.out.println("Enter your  salary");
        int salary = input.nextInt();

        System.out.println("Enter your credit score");
        int creditScore = input.nextInt();

        input.close();

        String result =(salary>60000 && creditScore> 650)? "Loan Approved" : "Loan denied" ;

        System.out.println(result);
    }
}

/*
Create a class called Loans,
Given two variables salary and credit score,
use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.
 */