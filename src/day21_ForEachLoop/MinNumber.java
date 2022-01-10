package day21_ForEachLoop;

public class MinNumber {

    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 8, 10, 9, 7, 5, 3, 1};

        int min = numbers[0];

        for (int each : numbers) {

            if (min>each){min=each;}

        }

        System.out.println(min);
    }
}
