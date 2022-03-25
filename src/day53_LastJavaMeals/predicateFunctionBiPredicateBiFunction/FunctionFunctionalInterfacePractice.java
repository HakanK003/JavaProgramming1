package day53_LastJavaMeals.predicateFunctionBiPredicateBiFunction;

import java.util.*;
import java.util.function.Function;

public class FunctionFunctionalInterfacePractice {

    public static void main(String[] args) {

        //4.1 Create a function that can return the sum of digits from a string
        Function<String, Integer> stringsDigitsSum = x-> {

            int sum = 0;

            for (int i = 0; i < x.length(); i++) {

                if (Character.isDigit(x.charAt(i))){
                    sum+=Integer.parseInt(""+x.charAt(i));
                }

            }

            return sum;
        };


        System.out.println(stringsDigitsSum.apply("H3H3H3"));

        //4.2 Create a function that can convert a Set of Integers to List of Integers
        Function<Set<Integer>, List<Integer>> convertSetToList = x-> {

            return new ArrayList<>(x);

        };

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);

        List<Integer> list = convertSetToList.apply(set);
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(list);

        //4.3 Create a function that can convert a Set of String to List of String
        Function<Set<String>, List<String>> convertSetToList2 = x-> {

            return new ArrayList<>(x);

        };

        Set<String> set2 = new HashSet<>();
        set2.add("Hello");
        set2.add("Java");
        set2.add("C#");
        set2.add("JavaScript");
        set2.add("Python");

        List<String> list2 = convertSetToList2.apply(set2);
        list2.addAll(Arrays.asList("Hello", "Java", "C#", "JavaScript", "Python"));
        System.out.println(list2);

        //4.4 Create a function that can return the reversed version of an int array
        Function<int[], int[]> reversedArrayInt = x -> {

            int[] reversed = new int[x.length];

            for (int i = 0, j = x.length-1; i < x.length; i++, j--) {

                reversed[i]=x[j];

            }

            return reversed;

        };

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(reversedArrayInt.apply(numbers)));

        //4.5 Create a function that can return the reversed version of a String array
        Function<String[], String[]> reversedArrayString = x -> {

            String[] reversed = new String[x.length];

            for (int i = 0, j = x.length-1; i < x.length; i++, j--) {

                reversed[i]=x[j];

            }

            return reversed;

        };

        String[] words = {"Hello1","Hello2","Hello3","Hello4","Hello5","Hello6" };

        System.out.println(Arrays.toString(reversedArrayString.apply(words)));

        //4.6 Create a function that can return the sorted (descending) version of an int array
        //Note: you can use the reverse function you created at 4.4
        Function<int[], int[]> descendingArrayInt = x -> {

            int a =x.length;

            int[] descending = new int[a];
            for (int i = 0; i < a; i++)
            {
                //if (x[i]==Integer.MIN_VALUE){continue;}
                int temp = x[i],
                    tempIndex=i;

                for (int j = i + 1; j < a; j++)
                {

                    if (x[i] < x[j] )
                    {
                        temp = x[j];
                        tempIndex =j;
                    }
                }

                descending[i]=temp;
                x[tempIndex]=Integer.MIN_VALUE;

            }
            return descending;

        };

        int[] numbers2 = {2, 1, 4, 3, 6, 3, 8, 7, 9};

        System.out.println(Arrays.toString(descendingArrayInt.apply(numbers)));

        //4.7 Create a function that can return the sorted (descending) version of a String array
        //Note: you can use the reverse function you created at 4.5


    }

}

/*
 Use Function functional interface to:
		4.1 Create a function that can return the sum of digits from a string

		4.2 Create a function that can convert a Set of Integers to List of Integers

		4.3 Create a function that can convert a Set of String to List of String

		4.4 Create a function that can return the reversed version of an int array

		4.5 Create a function that can return the reversed version of a String array

		4.6 Create a function that can return the sorted (descending) version of an int array
				Note: you can use the reverse function you created at 4.4

		4.7 Create a function that can return the sorted (descending) version of a String array
				Note: you can use the reverse function you created at 4.5
 */