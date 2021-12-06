package day19_LoopPracticesAndExit;

import java.util.Scanner;

public class IndexOfFirstUnique {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = input.nextLine();
        input.close();

        char result = ' ';

        for (int i = 0; i < str.length(); i++) {

            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i)==str.charAt(j)){frequency++;}

            }

            if (frequency==1){
                result=str.charAt(i);
                break;
            }

        }

        System.out.println(result);
        
    }
}

/*
 Write a program that can return the index number of the first unique character.
 */