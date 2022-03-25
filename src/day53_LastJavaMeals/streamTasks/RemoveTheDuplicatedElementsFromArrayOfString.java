package day53_LastJavaMeals.streamTasks;

import java.util.Arrays;

public class RemoveTheDuplicatedElementsFromArrayOfString {

    public static void main(String[] args) {

        String[] strArray = {"Java", "C#", "Python","Java", "C#","Hello", "Python","Java", "C#", "Python" };

        strArray = Arrays.stream(strArray).distinct().toArray(String[]::new);

        System.out.println(Arrays.toString(strArray));

    }

}

/*
 Write a program that can remove the duplicated elements of an array of String
 */