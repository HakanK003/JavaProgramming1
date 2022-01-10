package day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FirstLastElementOfArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        Collections.swap(numbers,0,numbers.size()-1);

        System.out.println(numbers);

    }
    
}

/*
write a program that can swap the first and last elements of an ArrayList of Integers
 */