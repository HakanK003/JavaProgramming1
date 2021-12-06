package day15_ForLoop;

import java.util.Scanner;

public class RewriteCharsFromString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
    String word = input.nextLine();

        input.close();

    int length = word.length();

    String digits="",         //48~57
            letters="",        //65~90&&97~122
            specialChars="";   //others

        for (int i = 0; i<=length-1; i++){

        int num =  word.charAt(i);
        char ch =  word.charAt(i);

        if((num>=65&&num<=90)||(num>=97&&num<=122))  {letters      += ch;}
        else if(num>=48&&num<=57)                         {digits       += ch;}
        else                                              {specialChars += ch;}
    }

        System.out.println("Digits: "+digits+"\nLetters: "+letters+"\nSpecial Chars: "+specialChars);
}
}

/*
 write a program that can retive the digits, letters and special
characters from a string
Ex:
input:
mn@#123Ab!
output:
letters: mnAb
digits: 123
special chars: @#!
 */