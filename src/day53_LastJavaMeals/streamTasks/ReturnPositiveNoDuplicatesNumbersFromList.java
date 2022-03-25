package day53_LastJavaMeals.streamTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnPositiveNoDuplicatesNumbersFromList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,-4,5,-5,1,2,3,4));

        System.out.println( list.stream().filter(p -> p > 0).distinct().collect( Collectors.toList())  );


    }

}

/*
Write a program that can return all the positive numbers of List without the duplicates
		ex:
			list = {1,2,3,4,-4,5,-5,1,2,3,4}

		output:

			{1,2,3,4,5}

 */