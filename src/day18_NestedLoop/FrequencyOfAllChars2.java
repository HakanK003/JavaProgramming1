package day18_NestedLoop;

import java.util.Scanner;

public class FrequencyOfAllChars2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String str1 = input.nextLine();

        String result="";

        for (int a =0; a<str1.length(); a++) {

            char ch = str1.charAt(a);  // each char from string
            int count = 0;

            for (int i = 0; i < str1.length(); i++) {  // to find the frequency of each char

                char each = str1.charAt(i);   // each char of str1
                if (ch == each) {
                    count++;
                }
            }

            if (result.contains(""+ch)){continue;}
            result+=ch;
            result+=count;
        }

        System.out.println(result);

    }
}
