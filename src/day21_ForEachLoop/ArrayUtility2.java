package day21_ForEachLoop;

import java.util.Arrays;

public class ArrayUtility2 {

    public static void main(String[] args) {


        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};

        String[] earlyBirds = Arrays.copyOf(students,5);  // if we write 30 we will receive 22 null

        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        numbers = Arrays.copyOf(numbers, 5);

        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------------------------------------------------");

        char[] ch1 ={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6+1); // similar to substring ex:[C, D, E, F, G]

        System.out.println(Arrays.toString(ch2));






    }

}
