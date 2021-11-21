package day10_NestedIf;

import java.util.Scanner;

public class SalaryAfterTax {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary");
        int salary = input.nextInt();

        System.out.println("Married? (True or False)");
        boolean married = input.hasNextBoolean();

        if(married){
            int salaryAfterTax= (salary>=130000)? salary-salary*30/100 :(salary>=100000)? salary-salary*25/100
                    :(salary>=80000)? salary-salary*20/100 : salary-salary*15/100;

        }else{
            int salaryAfterTax= (salary>=130000)? salary-salary*35/100 :(salary>=100000)? salary-salary*30/100
                    :(salary>=80000)? salary-salary*25/100 : salary-salary*20/100;

        }
/*
IFSALARY=130000 tax rat4e =0.35

ifmarried== tax-=0.05

double = salary- tax
print doub;e
 */
      //  System.out.println("Your salary after tax is: " + salaryAfterTax);


    }
}
/*
 Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 130k
                        25% for salary of 80K to 100K
                        20% for salary of 79.999K or less

                in addition, if the person is married, he/she will pay 5% less tax

 */