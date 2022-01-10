package day28_ArrayList;

import java.util.ArrayList;

public class FindMax {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int max = numbers.get(0);
        for (Integer number : numbers) {
            if (number > max){ max = number;}
        }

        System.out.println("Max number is --> "+ max);

    }

}

/*
 Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5
 */