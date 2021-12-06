package day16_ForLoopStringPractice;

import java.util.Scanner;

public class DigitLetterSpecialChars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = input.nextLine();

        input.close();
        String letters = " ";
        String digits ="";
        String specialChars ="";

        for (int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9'){digits += ch;}
            else if (ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'){letters += ch;}
            else { if(ch != ' '){specialChars += ch;} }   // ignore space

        }

        System.out.println("digits = "       + digits);
        System.out.println("letters = "      + letters);
        System.out.println("specialChars = " + specialChars);

    }
}
