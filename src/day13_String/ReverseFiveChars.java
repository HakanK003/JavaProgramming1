package day13_String;

import java.util.Scanner;

public class ReverseFiveChars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String word = input.nextLine();

        input.close();

        int length = word.length();

        String result="";
        if(length==5)
        { for(int i = length-1; i>=0; i--){result+=""+word.charAt(i);}}
        else if(length >5) {result= "Too long!";}
        else {result= "Too short!";}

        System.out.println(result);
        
    }
}

/*
Create a class called Reverse, write a program that will reverse a
string.
Your program should reverse a string only 5 characters long.
If word is shorter, display message: "Too short!".
If word is longer, display message: "Too long!".
Otherwise, reverse this word and print out result into the console.
 */