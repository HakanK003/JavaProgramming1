package day16_ForLoopStringPractice;

import java.util.Scanner;

public class HowManyJava {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence= input.nextLine().toLowerCase();
        System.out.println("Enter word to count");
        String word= input.nextLine().toLowerCase();
        input.close();

        int count = 0;


        for (int i = 0; i <= sentence.length()-3; i++){

            String check =""+sentence.charAt(i)+sentence.charAt(i+1)+sentence.charAt(i+2);

            for (int a=0; a<=word.length(); a++){check+=""+sentence.charAt(a);}

            if (check.equals(word)){count+=1;}

        }

        System.out.println(count);
    }
}

/*
write a program that can return the frequency of the a word Java from
the sentence
Ex:
sentence = "Java Java";
output:
2
Hint: you need to create
 */