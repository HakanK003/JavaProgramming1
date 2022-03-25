package day53_LastJavaMeals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFunctionalInterfaceTasks {

    public static void main(String[] args) {


        //1.1 Create a function that can return the maximum number from a list of Integer
        ListFunctionalInterface<Integer, Integer> maxFromList = s -> {

            int max = s.get(0);

            for (Integer each : s) {
                if (max<each){max=each;}
            }

            return max;

        };

        List<Integer> numList = new ArrayList<>(Arrays.asList(1, 2, 2, 9, 8, 3, 5, 6, 7, 4 ));

        System.out.println("Max number from list is = "+maxFromList.apply(numList));


        //1.2 Create a function that can return the minimum number from a list of Integer
        ListFunctionalInterface<Integer, Integer> minFromList = s -> {

            int min = s.get(0);

            for (Integer each : s) {
                if (min>each){min=each;}
            }

            return min;

        };

        List<Integer> numList2 = new ArrayList<>(Arrays.asList(2, 2, 1, 9, 8, 3, 5, 6, 7, 4 ));

        System.out.println("Min number from list is = "+minFromList.apply(numList2));


        //1.3 Create a function that can return the longest String from a List of String
        ListFunctionalInterface<String, String> longestString = x -> {

            String longest = x.get(0);

            for (String each : x) {

                if (longest.length()<each.length()){longest=each;}

            }

            return longest;

        };


        List<String> wordsList1 = new ArrayList<>( Arrays.asList("Hello", "Java", "Python", "C#", "JavaScript") );

        System.out.println("Longest string is = "+longestString.apply(wordsList1));


        //1.4 Create a function that can return the shortest String from a List of String
        ListFunctionalInterface<String, String> shortestString = x -> {

            String shortest = x.get(0);

            for (String each : x) {

                if (shortest.length()>each.length()){shortest=each;}

            }

            return shortest;

        };


        List<String> wordsList2 = new ArrayList<>( Arrays.asList("Hello", "Java", "Python", "C#", "JavaScript") );

        System.out.println("shortest string is = "+shortestString.apply(wordsList2));

        //1.5 Create a function that can convert List of integer to int array
        ListFunctionalInterface<Integer, int[]> intListToArray = a -> {

            int[] nums = new int[a.size()];

            for (int i = 0; i < a.size(); i++) {

                nums[i]=a.get(i);

            }

            return nums;

        };


        List<Integer> numbers = new ArrayList<>( Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9) );


        System.out.println(Arrays.toString(intListToArray.apply(numbers)));

        //1.6 Create a function that can convert List of double to double array
        ListFunctionalInterface<Double, double[]> doubleListToArray = a -> {

            double[] nums = new double[a.size()];

            for (int i = 0; i < a.size(); i++) {

                nums[i]=a.get(i);

            }

            return nums;

        };


        List<Double> numbers2 = new ArrayList<>( Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9) );


        System.out.println(Arrays.toString(doubleListToArray.apply(numbers2)));

    }

}

/*
Create a functional interface named ListFunction that contains the following abstract method:

		R apply(List<T>  list);

	Use ListFunction functional interface to:
		1.1 Create a function that can return the maximum number from a list of Integer

		1.2 Create a function that can return the minimum number from a list of Integer

		1.3 Create a function that can return the longest String from a List of String

		1.4 Create a function that can return the shortest String from a List of String

		1.5 Create a function that can convert List of integer to int array

		1.6 Create a function that can convert List of double to double array
 */