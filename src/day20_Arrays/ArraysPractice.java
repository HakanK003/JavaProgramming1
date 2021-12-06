package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        // store these elements: 10 20 50 70

        int[] numbers ={10,20,50,70};

        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------------------------------");

        // create a variable that can contains 5 scores

        int[] scores = new int[5];
        scores[0]=65;
        scores[1]=85;
        scores[2]=55;
        scores[3]=75;
        scores[scores.length-1]=95;

        System.out.println( Arrays.toString(scores));

        System.out.println("-------------------------------------");

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        /*
        System.out.println(months[0]);
        System.out.println(months[1]);
        System.out.println(months[2]);
        System.out.println(months[3]);
        System.out.println(months[4]);
        System.out.println(months[5]);
        System.out.println(months[6]);
        System.out.println(months[7]);
        System.out.println(months[8]);
        System.out.println(months[9]);
        System.out.println(months[10]);
        System.out.println(months[11]);
         */

        for (int i=0; i< months.length; i++){
            System.out.println(months[i]);
        }

        System.out.println("-------------------------------------");

        for (int i= months.length-1; i>=0; i--){
            System.out.println(months[i]);
        }




    }
}
