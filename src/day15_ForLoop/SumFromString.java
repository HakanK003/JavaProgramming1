package day15_ForLoop;

import java.util.Scanner;

public class SumFromString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String word = input.nextLine();

        input.close();

        int length = word.length();

        int digits=0;         //48~57
        String others="";   //others

        for (int i = 0; i<=length-1; i++){

            int num =  word.charAt(i);
            char ch =  word.charAt(i);

            if(num>=48&&num<=57)     {
                byte toSum=0;
                switch (num){
                    case 48:
                        toSum=0;
                        break;
                    case 49:
                        toSum=1;
                        break;
                    case 50:
                        toSum=2;
                        break;
                    case 51:
                        toSum=3;
                        break;
                    case 52:
                        toSum=4;
                        break;
                    case 53:
                        toSum=5;
                        break;
                    case 54:
                        toSum=6;
                        break;
                    case 55:
                        toSum=7;
                        break;
                    case 56:
                        toSum=8;
                        break;
                    case 57:
                        toSum=9;
                        break;
                }
                digits += toSum;}
            else                     {others += ch;}
        }

        System.out.println("Sum= "+digits+"\nOthers: "+others);
    }
}

/*
Write a program that can return the sum of digits from a  string
Ex:
input: A1B2C3
output:    6
Hint: You need to get each of the character by using a loop
             To convert char to number:

   '0' - 48   ==> 0

   '1' - 48   ==> 1
 */