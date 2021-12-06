package day14_String;

import java.util.Scanner;

public class LyReally {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.nextLine();

        input.close();

        String result= (word.endsWith("ly"))? "really???" : "never mind";

        System.out.println(result);


    }
}

/*
ask the user to enter a word. if the word ends with "ly", print
"really???" ,  otherwise, print "never mind"
 */