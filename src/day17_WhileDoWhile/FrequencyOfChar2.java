package day17_WhileDoWhile;

import java.util.Scanner;

public class FrequencyOfChar2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = input.nextLine();
        System.out.println("Enter a char");
        char ch = input.next().charAt(0);
        input.close();

        int frequency =0;

        for (int i =0; i<str.length(); i++){

            char eachChar = str.charAt(i);

            if (ch==eachChar){frequency++;}

        }

        System.out.println(frequency);

    }



}
