package day23_CustomMethod;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Are you USA citizen (yes/no)");
        String yesNo = input.next();

        eligibleToVote(age,yesNo);


    }

    public static void eligibleToVote(int age,String citizen){

        String result = (age>=18)? (citizen.equalsIgnoreCase("yes"))? "You are eligible to vote" :
                "You aren't eligible to vote because you aren't a citizen" :
                "You aren't eligible to vote";

        System.out.println(result);
    }
}

/*
 create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!
 */