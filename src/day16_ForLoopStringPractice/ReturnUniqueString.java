package day16_ForLoopStringPractice;

import java.util.Scanner;

public class ReturnUniqueString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String str= input.nextLine();

        String result="";

        for (int i = 0; i<str.length(); i++){

            char ch = str.charAt(i);
            if (str.indexOf(ch)==str.lastIndexOf(ch)){result +=ch;}

        }

        System.out.println(result);
    }

}

/*
Write a program that can return the unique characters from a String

            Ex:
                input:
                    AABCCD

                output:
                    BD

            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique

 */