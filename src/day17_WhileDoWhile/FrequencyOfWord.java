package day17_WhileDoWhile;

import java.util.Scanner;

public class FrequencyOfWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = input.nextLine().toLowerCase();
        System.out.println("Enter a word");
        String word = input.nextLine().toLowerCase();

        input.close();

        int frequency = 0;

        for (int i = 0; i <=sentence.length()-word.length();i++){

            String eachSub = sentence.substring(i, i+word.length());

            if (eachSub.equals(word)){frequency++;}

        }

        System.out.println(frequency);


    }
}
