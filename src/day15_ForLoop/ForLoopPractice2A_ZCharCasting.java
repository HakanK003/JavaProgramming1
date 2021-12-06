package day15_ForLoop;

public class ForLoopPractice2A_ZCharCasting {

    public static void main(String[] args) {

        for (char i =65; i<=90 ; i++){
            System.out.print(i + " ");
        }

        System.out.println("\n--------------------------------------------");

        for (char i = 90; i>=65; i--){
            System.out.print(i + " ");
        }

        System.out.println("\n--------------------------------------------");

        for (char  i = 97; i<=122; i++){
            System.out.print(i + " ");
        }

        System.out.println("\n--------------------------------------------");

        for (char i = 122; i>=97; i--){
            System.out.print(i + " ");
        }

        System.out.println("\n--------------------------------------------");

        for (char i = 'A'; i<='Z'; i++){
            System.out.print(i + " ");
        }

        System.out.println("\n--------------------------------------------");

        for (char i = 'Z'; i>='A'; i--){
            System.out.print(i + " ");
        }

        System.out.println("\n--------------------------------------------");

        for (char i = 'a'; i<='z'; i++){
            System.out.print(i + " ");
        }

        System.out.println("\n--------------------------------------------");

        for (char i = 'z'; i>='a'; i--){
            System.out.print(i + " ");
        }

        System.out.println("\n--------------------------------------------");

        for (int i = 65 ; i<=90; i++){
            System.out.print((char)i+ " ");
        }

        System.out.println("\n--------------------------------------------");

        for (int i = 90 ; i>=65; i--){
            System.out.print((char)i+ " ");
        }

        System.out.println("\n--------------------------------------------");

        for (int i = 97 ; i<=122; i++){
            System.out.print((char)i+ " ");
        }

        System.out.println("\n--------------------------------------------");

        for (int i = 122 ; i>=97; i--){
            System.out.print((char)i+ " ");
        }
/*
        System.out.println("\n--------------------------------------------");

        for (char i = 1; i<=40000; i++){
            System.out.print(i + " ");
        }
*/

    }
}
