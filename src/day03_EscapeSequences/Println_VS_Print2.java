package day03_EscapeSequences;

public class Println_VS_Print2 {

    public static void main(String[] args) {

        System.out.println("Knock Knock");
        System.out.println("Who is this?");
        System.out.println("This is Java");
        //ln leave a blanc space even if there is anythink (hits enter) [shows message + hits enter]
        System.out.println("----------------");
        System.out.print("Knock Knock");
        //print dont leave a blanc space (doesnt hit enter) [shows message]
        System.out.print("Who is this?");
        System.out.print("This is Java");
        System.out.print(""); //(we have to do like this if we want to leave blanc line)
        System.out.println("------------------");
        //exemple with long text
        System.out.println("Hello Everyone, how are you all today? Today we will learn Escape Sequences, and next week we will learn Variables");
        //or
        System.out.print("Hello Everyone, how are you all today?");
        System.out.print("Today we will learn Escape Sequences");
        System.out.print("and next week we will learn Variables");
    }



}
