package day23_CustomMethod;

import java.util.Locale;
import java.util.Scanner;

public class FullNameToRegularFormat {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter full name");
        String str = input.nextLine();

        nameRegularFormat(str);

    }

    public static void nameRegularFormat(String fullName){

        fullName=fullName.toUpperCase();

        fullName=fullName.charAt(0)+fullName.substring(1,fullName.indexOf(" ")).toLowerCase()+" "
                +fullName.charAt(fullName.indexOf(" ")+1)+fullName.substring(fullName.indexOf(" ")+2).toLowerCase();

        System.out.println(fullName);
    }
}

/*
write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"
 */