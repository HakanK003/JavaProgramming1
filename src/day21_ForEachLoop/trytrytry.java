package day21_ForEachLoop;

import java.util.*;

public class trytrytry {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below
        input.close();

        String[] initials = new String[words.length];

        for(int i=0; i<words.length; i++){

           // String each="";

           // words[i]=each;

            initials[i]=""+words[i].charAt(0)+words[i].charAt(words[i].length()-1);

        }
        System.out.println(Arrays.toString(initials));


    }
}
