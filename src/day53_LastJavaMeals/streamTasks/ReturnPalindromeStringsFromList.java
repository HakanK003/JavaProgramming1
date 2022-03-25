package day53_LastJavaMeals.streamTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnPalindromeStringsFromList {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("Java", "level", "Anna", "Wooden Spoon"));

        words.stream().filter(x->x.equalsIgnoreCase( new StringBuilder(x).reverse().toString() )).forEach(System.out::println);

    }

}

/*
Write a program that can return the palindrome Strings from a list:
		Ex:
			list = {"Java", "level", "Anna", "Wooden Spoon"};

		output:
			{"level", "Anna"}
 */