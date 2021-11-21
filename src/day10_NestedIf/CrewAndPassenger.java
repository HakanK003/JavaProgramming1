package day10_NestedIf;

import java.util.Scanner;

public class CrewAndPassenger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of people");
        int people = input.nextInt();

        input.close();

        String result = (people==50||people==75||people==100)? (people==50)? "20 crew, 30 passengers"
                        :(people==75)? "25 crew, 50 passengers" : "30 crew, 70 passengers" : "Invalid";

        System.out.println(result);



    }
}
/*
Create a class called CrewAndPassanger,
Given a number of people on the ship (int number),
determine how many need to be crew members and how many can be passengers.
Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */