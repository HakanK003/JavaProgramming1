package day13_String;

import java.util.Scanner;

public class ThreeLetterCool {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three letter word");
        String word = input.nextLine();

        input.close();

        String result =  (word.length()==3)?
                         (word.substring(1,2).equalsIgnoreCase("a"))? "Cool Word" : "Okay Word"
                        :(word.length()>3)? "Word is too long" : "Word is too short" ;

        System.out.println(result);

    }
}

/*
write a program that asks the user enter a three letter word. Check if
the middle character of the given word is 'a'. In the case it is
print: "Cool word", but in the case the middle letter is not 'a'
print: "Okay word".
- If the user does not enter a 3 letter word tell them:
If the word is less than 3 letters: "Word is too short"
If the word is too long: "Word is too long"
 */