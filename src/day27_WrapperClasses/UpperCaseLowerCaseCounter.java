package day27_WrapperClasses;

import java.util.Scanner;

public class UpperCaseLowerCaseCounter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = input.nextLine();
        input.close();

        int upperCaseCount=0,
            lowerCaseCount=0;

        for (char each: str.toCharArray()){

            if (Character.isLowerCase(each)){lowerCaseCount++;}
            if (Character.isUpperCase(each)){upperCaseCount++;}

        }
        boolean a = false;
        if (upperCaseCount==lowerCaseCount){a=true;}
        System.out.println(a);

    }

}

/*
Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
 */