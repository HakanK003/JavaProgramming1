package day53_LastJavaMeals.streamTasks;

import java.util.Arrays;

public class CountPositiveNumbersFromArray {

    public static void main(String[] args) {

        int[] numbers = {-1, 1, 2, 3, 4, -5, -6, 7, -8, -9, -10, -11};

        long positiveCount = Arrays.stream(numbers).filter(x->x>0).count();

        System.out.println("positiveCount = " + positiveCount);

    }

}

/*
Write a program that can count how many Positive numbers does the List has
		ex: List = {1,2,3,4,-4,5,-5}

		output:
			5
 */