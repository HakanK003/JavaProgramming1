package day53_LastJavaMeals.predicateFunctionBiPredicateBiFunction;

import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionFunctionalInterfacePractice {

    public static void main(String[] args) {

        //1
        BiFunction<String, String, String> findCommons =( x, y )-> {

            char[] ch1 = x.toCharArray();
            char[] ch2 = y.toCharArray();

            String result ="";

            for (int i = 0; i < ch1.length; i++) {


                for (int j = 0; j < ch1.length; j++) {

                    if (ch1[i]==ch2[j]){

                        result+=ch1[i];
                        ch1[i]=' ';

                    }

                }

            }

            return result;

        };


        String str1 = "Python", str2="Wooden Spoon";

        System.out.println(findCommons.apply(str1, str2));



        //2
        BiFunction<int[], int[], List<Integer>> findCommonIntegers = (x, y) -> {

            List<Integer> commons = new ArrayList<>();

            for (int i = 0; i < x.length; i++) {

                for (int j = 0; j < y.length; j++) {

                    if (x[i]==y[j]){

                        commons.add(x[i]);

                    }

                }

            }



            return commons;

        };

        int[] nums1 = {1, 2, 3, 4, 5, 6, 6, 6};
        int[] nums2 = {1, 1, 1, 6};

        System.out.println(findCommonIntegers.apply(nums1, nums2));

    }

}

/*
Use BiFunction functional interface to:
		6.1 Create a function that can returns the common characters of two strings
				ex: str1 = "Python"
					str2 = "Wooden Spoon"

				output: on

		6.2 Create a function that can return the common elements of two integer arrays

		6.3 Create a function that can return the common elements of two String arrays

		6.4 Create a function that can return the common elements of two Lists of Integers

		6.5 Create a function that can return the common elements of two Lists of Strings

 */