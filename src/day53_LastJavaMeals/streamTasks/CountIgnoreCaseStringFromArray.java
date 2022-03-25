package day53_LastJavaMeals.streamTasks;

import java.util.Arrays;

public class CountIgnoreCaseStringFromArray {

    public static void main(String[] args) {

        String[] words = {"Java", "Python", "jAvA", "JaVa", "PyThoN", "JAVA", "PYTHON"};

        long javaCount = Arrays.stream(words).filter( p -> p.equalsIgnoreCase("java")).count();

        long pythonCount = Arrays.stream(words).filter( p -> p.equalsIgnoreCase("python")).count();


        System.out.println("javaCount = " + javaCount + "\npythonCount = " + pythonCount);

    }

}

/*
Write a program that can count how many "java" and "python" does the array has:
			ex: array = {"Java", "jAVa", "pythON"}

			output:
				countJava = 2
				countPython = 1
 */