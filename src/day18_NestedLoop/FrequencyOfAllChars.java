package day17_NestedLoop;

import java.util.Scanner;

public class FrequencyOfAllChars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = input.nextLine();

        input.close();

        String result="";   //we will add here all things that we find
        int count=1;        //we will calculate frequency here (we start with 1 because min frequency is 1)
        result+=str.charAt(0);          //we have to add first char by ourselves because loop cannot

        for (int i= 1; i<str.length(); i++){      //we start with index no 1 because v
            if (str.charAt(i)==str.charAt(i-1)){count++;} //we check if char that in index i is same with previous char
            else{result+=""+count; count=1; result+=""+str.charAt(i); } //if they are same we +1 to count
        }       /*
                    if not same
                    1-we add count to result to show how many times previous char used
                    2-we reset count to 1 for new char
                    3-we add new char to result for having result like a3b4c2
                */
        result+=count;      //for adding frequency of the last char

        System.out.println(result);     //print our result
    }
}
/*
Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters
 */