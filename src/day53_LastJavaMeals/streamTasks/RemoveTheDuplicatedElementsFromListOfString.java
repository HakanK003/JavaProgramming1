package day53_LastJavaMeals.streamTasks;

import day13_String.StringIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveTheDuplicatedElementsFromListOfString {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("Java", "C#", "Python","Java", "C#","Hello", "Python","Java", "C#", "Python" ));

        words = words.stream().distinct().collect(Collectors.toList());

        System.out.println(words);

    }

}

/*
Write a program that can remove the duplicated elements of a List of String
 */