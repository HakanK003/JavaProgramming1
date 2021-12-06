package day17_WhileDoWhile;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        while(!(age>=1 &&age<=120)){
            System.err.println("Re enter your age\nEnter your age: ");
            age = input.nextInt();
        }

        System.out.println("Are you US citizen? yes/no ");
        String ans = input.next().toLowerCase();

        while(!(ans.equals("yes")||ans.equals("no"))){
            System.err.println("Re enter your age\nAre you US citizen? yes/no ");
            ans = input.next().toLowerCase();
        }

        input.close();

        if (age>=18 && ans.equals("yes")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("Your are not eligible to vote");
        }

    }
}
