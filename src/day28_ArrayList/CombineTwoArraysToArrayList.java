package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArraysToArrayList {

    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));

        System.out.println(list);

        System.out.println("--------------------------------------------------------");

        int[] arr3 = {1, 2, 3};
        int[] arr4 = {4, 5, 6};

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int each : arr3) {
            numbers.add(each);
        }
        for (int each : arr4) {
            numbers.add(each);
        }

        System.out.println(numbers);


    }

}

/*
write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */