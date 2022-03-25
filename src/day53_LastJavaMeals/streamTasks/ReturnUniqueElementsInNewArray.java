package day53_LastJavaMeals.streamTasks;

import java.util.Arrays;

public class ReturnUniqueElementsInNewArray {

    public static void main(String[] args) {

        int[] numbers = {1,1,2,3,3,4,5,5,6};

        System.out.println(
                Arrays.toString(
                        Arrays.stream(numbers).filter(p -> {
                                int count = 0;
                                for (int number : numbers) {
                                    if (p == number) {
                                        count++;
                                    }
                                }
                                return count == 1;
                            } ).toArray()
                )
        );

    }

}

/*
Write a program that can return the unique elements of an array as a new array:

		Ex: arr = {1,1,2,3,3,4,5,5,6};

		output:
			{2,4,6}
 */