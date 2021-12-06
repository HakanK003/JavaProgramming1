package day19_LoopPracticesAndExit;

import java.util.Scanner;

public class OddOrEven2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {


        System.out.println("Enter a number");
        int num= input.nextInt();

        if (num%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }

        System.out.println("would you want to enter another number? (yes/no)");
        String a = input.next();

        if (!(a.equalsIgnoreCase("yes")||a.equalsIgnoreCase("no"))){
            System.err.println("Invalid Entry");
            System.exit(0);
        }

        if (a.equalsIgnoreCase("no")){break;}

        }

    }

}
