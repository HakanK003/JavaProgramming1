package day13_String;

import java.util.Scanner;

public class CheckThreeWordLength {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter first word");
        String first = input.nextLine();
        System.out.println("Enter second word");
        String second = input.nextLine();
        System.out.println("Enter third word");
        String third = input.nextLine();

        input.close();

        int firstLong = first.length();
        int secondLong = second.length();
        int thirdLong = third.length();

        String result =  (firstLong==secondLong&&secondLong==thirdLong)? "All words same length"
                        :(firstLong!=thirdLong&&firstLong!=secondLong&&secondLong!=thirdLong)? "All different length"
                        : "Not same nor different lengths";

        System.out.println(result);

    }
}

/*
Write a program  for CheckWords, the program accepts 3 words and :
- if they are same length:  print "All words are same length"
- if some same length and others not:    print "Not Same nor
Different lengths"
- if all different length :  print "All different length"
 */