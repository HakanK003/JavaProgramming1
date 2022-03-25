package day53_LastJavaMeals.streamTasks;

import java.util.Arrays;

public class CountNegativeNumbersFromArray {

    public static void main(String[] args) {

        int[] numbers = {-1, 1, 2, 3, 4, -5, -6, 7, -8, -9, -10, -11};

        long negativeCount = Arrays.stream(numbers).filter(x-> x<0).count();

        System.out.println("negativeCount = " + negativeCount);

    }

}

/*
Write a program that can count how many negative numbers does the array has
		ex: arr = {1,2,3,4,-4,5,-5}

		output:
			2
 */