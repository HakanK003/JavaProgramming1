package day53_LastJavaMeals.streamTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnNegativeNoDuplicatesNumbersFromList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,-4,5,-5,1,2,3,4));

        System.out.println(list.stream().filter(x -> x < 0).distinct().collect(Collectors.toList()));

    }

}

/*
Write a program that can return all the negative numbers of the array as a new array
		ex:
			arr = {1,2,3,4,-4,5,-5}

		output:
			{-4, -5}
 */