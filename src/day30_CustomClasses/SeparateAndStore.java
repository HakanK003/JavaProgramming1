package day30_CustomClasses;

import java.util.ArrayList;

public class SeparateAndStore {

    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> numbers = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> specialChars = new ArrayList<>();

        for (char each : str.toCharArray()){

            if (Character.isDigit(each)){
                numbers.add(each);
            }else if (Character.isLetter(each)){
                letters.add(each);
            }else{
                specialChars.add(each);
            }

        }

        System.out.println("letters = " + letters+ "\nnumbers = " + numbers+ "\nspecialChars = " + specialChars);

    }

}

/*
Write a program that can extract the special characters, digits and letters
from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
 */