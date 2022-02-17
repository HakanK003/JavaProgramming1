package day18_NestedLoop;

import java.util.Scanner;

public class FindUniques {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter a string");
        String str = input.nextLine();

        input.close();

        int length =str.length();
        String result="";

        for (int i =0; i<str.length(); i++){

            String str2=str.replace(""+str.charAt(i),"");

            if (length-str2.length()==1){result+=""+str.charAt(i);}

        }

        System.out.println(result);
    }

}

/*
Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique
 */