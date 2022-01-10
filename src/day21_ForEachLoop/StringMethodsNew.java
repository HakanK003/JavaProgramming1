package day21_ForEachLoop;

import java.util.Scanner;

public class StringMethodsNew {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        boolean strCheck ;
        int count = 1;
        do {


        System.out.println("Enter a string");
        strCheck = input.hasNext("a");
        String str= input.nextLine();

        System.out.println(count+" "+str);
        count++;

        }while(strCheck);


    }
}
