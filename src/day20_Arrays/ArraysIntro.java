package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] myGroup = new String[5];     //created a variable for contain 5  names

        //System.out.println(myGroup);           //wrong way to print arrays (will give us hash codes)
        System.out.println(Arrays.toString(myGroup));   // Array has a utility class ==> import java.util.Arrays;
                                                        /*
                                                        Variable has nothing in, so we will see default values
                                                        Default Value (for fields)
                                                        byte    0
                                                        short    0
                                                        int    0
                                                        long    0L
                                                        float    0.0f
                                                        double    0.0d
                                                        char    '\u0000'
                                                        String (or any object)      null
                                                         */
        myGroup[0]="Gunay";
        myGroup[1]="Neira";
        myGroup[2]="Suat";
        myGroup[3]="Hulya";
        myGroup[4]="Mikael";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("------------------------------------------------");

        String[] days ={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //                 0          1           2           3           4          5          6

        System.out.println(Arrays.toString(days));

        System.out.println("Enter the number of the day");
        int number = input.nextInt();

        if (!(number>0&&number<8)){
            System.err.println("Invalid number");
            System.exit(0);
        }

        System.out.println(days[number-1]);
/*
        System.out.println("Enter the number of the day");
        System.out.println(days[input.nextInt()-1]);
        Will give us error when we type out of range
*/





    }
}
