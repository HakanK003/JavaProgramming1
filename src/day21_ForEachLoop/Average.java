package day21_ForEachLoop;

public class Average {

    public static void main(String[] args) {

        int[] numbers = {1, 3, 5, 7, 9, 10, 8, 6, 4, 2};

        double sum=0;

        for (int each : numbers) {
            sum+=each;
        }

        double average= sum/ numbers.length;

        System.out.println(average);

    }
}
