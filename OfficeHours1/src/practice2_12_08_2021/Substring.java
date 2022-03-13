package practice2_12_08_2021;

import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = input.nextLine();

        if (str.length()>1){
            System.out.println(""+str.charAt(0)+str.charAt(1));
        }else if(str.length()>0){        System.out.println(str);
        }else{
            System.out.println("Invalid string");
        }

    }
}

/*
(substring-length-isEmpty)

                      Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".

                              Input :"Hello"   → "He"
                              Input :"abcdefg" → "ab"
                              Input :"a"         → "a"
                              Input :""         → "It can not be empty"
                              without substring
 */