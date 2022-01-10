package day01;

public class CopyOfLastTwo {

    public static void main(String[] args) {

        String word = "Cydeo";

        String newWord = word.substring(word.length()-2).repeat(3);

        System.out.println(newWord);

    }
}

/*
Create a method print a new string made of 3 copies of the last 2 chars of the original string.
The string length will be at least 2.
 */