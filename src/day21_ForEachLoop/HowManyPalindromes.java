package day21_ForEachLoop;

public class HowManyPalindromes {

    public static void main(String[] args) {

        String[] arr1 = {"anna", "level", "Java", "Wooden Spoon", "Hello World", "Noon", "WoW"};
                         // Noon will not count because java is case-sensitive

        int result = 0;

        for (String each : arr1) {

            String str = each;
            String reversed = "";

            for (int i =str.length()-1; i >=0; i--){

                reversed+=str.charAt(i)+"";

            }

            if (each.equals(reversed)){result++;}

        }

        System.out.println(result);

    }
}

/*
 write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2

 */