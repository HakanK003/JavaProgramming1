package day53_LastJavaMeals;

import day05_Concantenation.Introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFunctionalInterfaceTasks {

    public static void main(String[] args) {

        //1.1 Create a function that can return the maximum number from an array of Integers
        ArrayFunctionalInterface<Integer, Integer> maxFromArray = x -> {

            int max = x[0];

            for (Integer each : x) {
                if (each>max){max=each;}
            }

            return max;

        };

        Integer[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        System.out.println(maxFromArray.apply(numbers1));


        //1.2 Create a function that can return the minimum number from an array of Integers
        ArrayFunctionalInterface<Integer, Integer> minFromArray = x -> {

            int min = x[0];

            for (Integer each : x) {
                if (each<min){min=each;}
            }

            return min;

        };

        Integer[] numbers2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};


        System.out.println(minFromArray.apply(numbers2));


        //1.3 Create a function that can return the longest String from an array of String
        ArrayFunctionalInterface<String, String> longestString = x -> {

            String longest = x[0];

            for (String each : x) {

                if (longest.length()<each.length()){longest=each;}

            }

            return longest;

        };


        String[] words1 = {"Hello", "Java", "Python", "C#", "JavaScript"};

        System.out.println("longest string is = "+longestString.apply(words1));


        //1.4 Create a function that can return the shortest String from an array of String
        ArrayFunctionalInterface<String, String> shortestString = x -> {

            String shortest = x[0];

            for (String each : x) {

                if (shortest.length()>each.length()){shortest=each;}

            }

            return shortest;

        };


        String[] words2 = {"Hello", "Java", "Python", "C#", "JavaScript"};

        System.out.println("shortest string is = "+shortestString.apply(words2));



    }

}

/*
Create a functional interface named ArrayFunction that contains the following abstract method:

		R apply(T[] array);

	Use the ArrayFunction interface to:

		2.1 Create a function that can return the maximum number from an array of Integers

		1.2 Create a function that can return the minimum number from an array of Integers

		1.3 Create a function that can return the longest String from an array of String

		1.4 Create a function that can return the shortest String from an array of String

 */