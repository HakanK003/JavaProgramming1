package day23_CustomMethod;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first string");
        String str1 = input.nextLine();
        System.out.println("Enter second string");
        String str2 = input.nextLine();
        input.close();

        anagramChecker(str1,str2);

    }

    public static void anagramChecker(String str1,String str2){

        char[] charList1 = str1.toCharArray();
        char[] charList2 = str2.toCharArray();

        Arrays.sort(charList1);
        Arrays.sort(charList2);

        boolean result = Arrays.equals(charList1,charList2);

        if (result){
            System.out.println(str1 + " and " + str2 + " are anagrams");
        }else {System.out.println(str1 + " and " + str2 + " aren't anagrams");}




    }
}

/*
create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram
 */