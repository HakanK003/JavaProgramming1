package day28_ArrayList;

import java.util.ArrayList;

public class FindMin {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int min = numbers.get(0);

        for (Integer each : numbers) {
            if (each<min){min=each;}
        }

        System.out.println("Min number is --> "+min);

    }
}

/*
Write a program that can find the minimum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				1
 */