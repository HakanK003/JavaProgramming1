package day21_ForEachLoop;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first string");
        String str1 = input.nextLine();

        System.out.println("Enter second string");
        String str2 = input.nextLine();

        char[] ch1 = str1.toCharArray();
        Arrays.sort(ch1);
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch2);

        boolean result=Arrays.equals(ch1, ch2);

        System.out.println("Anagram? "+result);

    }
}
