package day10_NestedIf;

import java.util.Scanner;

public class TernariesWithNestedIf {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Score");
        int score = input.nextInt();

        String result = (score>=0&&score<=100)? (score>=60)? "Passed" : "Failed" : "Invalid Score" ;

        System.out.println(result);




        





    }

}
