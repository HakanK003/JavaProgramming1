package day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ZerosToEnd {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0, 1, 2, 0, 0, 0, 5, 7, 6, 0, 8, 0));

        int countZero = Collections.frequency(numbers,0);

        numbers.removeIf(x -> x==0);

        for (int i = 0; i < countZero ; i++) {
            numbers.add(0);
        }

        System.out.println(numbers);

    }

}

/*
Write a program that can move all the zeros to the last indexes of ArrayList

                    Ex:
                        list: {1,0,2,0,3,0,4,0}

                    output:
                        [1, 2, 3, 4, 0, 0, 0, 0]
 */