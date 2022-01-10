package day27_WrapperClasses;

import java.util.Scanner;

public class RetrieveLetterDigitsCharFromString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = input.nextLine();
        input.close();

        String digits="",
               letters="",
               specialChars="";

        for (char each:str.toCharArray()) {

            if (Character.isDigit(each)){digits+=each;}
            else if (Character.isLetter(each)){letters+=each;}
            else{specialChars+=each;}
        }

        System.out.println("Digits are --> "+digits+"\nLetters are --> "+letters+"\nSpecial Chars are --> "+specialChars);

    }
}

/*
Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";

 */