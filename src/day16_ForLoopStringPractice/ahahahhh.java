package day16_ForLoopStringPractice;

import java.util.Scanner;

public class ahahahhh {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence= input.nextLine().toLowerCase();
        System.out.println("Enter word to count");
        String word= input.nextLine().toLowerCase();
        input.close();

        int count = 0;


        for (int i = 0; i <= sentence.length()-3; i++) {


            String check = "";


            for ( i = 0; i <= word.length() - 1; i++) {

                check += "" + sentence.charAt(i);

                }



            if (check.equals(word)) {
                count += 1;

                check="";



            }


        }



        System.out.println(count);


    }
}
