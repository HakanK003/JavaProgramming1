package day17_WhileDoWhile;

import java.util.Scanner;

public class FrequencyOfWord2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = input.nextLine().toLowerCase();
        System.out.println("Enter a word");
        String word = input.nextLine().toLowerCase();

        int frequency = 0;

        while(sentence.contains(word)){
           sentence = sentence.replaceFirst(word, "");
           frequency++;
        }

        System.out.println("----------------------------------------------------");

        String sentence2 = input.nextLine().toLowerCase();
        String word2 = input.nextLine().toLowerCase();
        String word3 = input.nextLine().toLowerCase();

        int countWord2 = 0;
        int countWord3 = 0;

        while(sentence2.contains(word2)){
            sentence2 = sentence2.replaceFirst(word2, "");
            countWord2++;
        }
        while(sentence2.contains(word3)){
            sentence2 =sentence2.replaceFirst(word3, "");
            countWord3++;
        }

        System.out.println("countWord2 = " + countWord2);
        System.out.println("countWord3 = " + countWord3);

        System.out.println("---------------------------------------------------");

        String sentence3 = input.nextLine().toLowerCase();
        String word4 = input.nextLine().toLowerCase();
        String word5 = input.nextLine().toLowerCase();

        int countWord4 = 0;
        int countWord5 = 0;

        while(sentence3.contains(word4)||sentence3.contains(word5)){

            if (sentence3.contains(word4)){
                sentence3 = sentence3.replaceFirst(word4, "");
                countWord4++;
            }
            if (sentence3.contains(word5)){
                sentence3 = sentence3.replaceFirst(word5, "");
                countWord5++;
            }
        }

        System.out.println("countWord4 = " + countWord4);
        System.out.println("countWord5 = " + countWord5);





    }
}
