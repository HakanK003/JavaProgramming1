package day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char [] alphabets = new char[26];

        alphabets[0] ='Z';

        System.out.println(Arrays.toString(alphabets));  // need import Arrays class

        System.out.println(alphabets[0]);  // this is an element of array so doesn't need Arrays class

    }
}
