package day17_WhileDoWhile;

import java.util.Scanner;

public class WillYouMarry {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Will you marry me? yes/no");
        String answerr = input.nextLine();

        while (!(answerr.equalsIgnoreCase("yes")||answerr.equalsIgnoreCase("no"))){
            System.err.println("Invalid\nWill you marry me? yes/no");
            answerr = input.nextLine();
        }

        if (answerr.equalsIgnoreCase("yes")){
            System.out.println("Congrats");
        }else{
            System.out.println("Good Luck");
        }

    }


}
