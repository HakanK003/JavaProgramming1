package day19_LoopPracticesAndExit;

import java.util.Scanner;

public class FirstDuplicated {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = input.nextLine();
        input.close();

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            int frequency =0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i)==str.charAt(j)){frequency++;}

                }

            if (frequency==2){
                result =""+str.charAt(i)+" "+frequency;
                break;

            }


        }

        System.out.println(result);

    }
}

/*
 Write a program that can return the first duplicated character from a string
 */