package practice2_12_08_2021;

import java.util.Scanner;

public class BloodDonate {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Enter your weight(kg)");
        int weight = input.nextInt();

        String result = (age>=18&&weight<50)? "You are not eligible to donate blood" :(age<18)? "Age must be grater then 18" : "You are eligible to donate blood";

        System.out.println(result);



    }
}

/*
( Scanner Class can be used )

                             (DonateBlood)
                            Create a program that accepts age and weight(kg) as int.

                            If age greater than or equal 18 and weight greater than 50 kg give a message
                                EXPECTED  :  "You are eligible to donate blood"

                            If age greater than or equal 18 and weight smaller or equal than 50 kg give a message
                                EXPECTED  :  "You are not eligible to donate blood"

                            If age is smaller than 18 "Age must be greater than 18"
                                EXPECTED  :  "Age must be greater than 18"
*/
