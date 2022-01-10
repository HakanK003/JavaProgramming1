package day24_CustumMethodsReturn;

public class MinNumFromArray {

    public static void main(String[] args) {

        int[] numbers= {2,3,4,5,6,1};
        minNumFinder(numbers);

    }

    public static void minNumFinder(int[] nums){

        int min = nums[0];

        for (int each : nums) {
            if (each<min){min=each;}
        }
        System.out.println(min);
    }
}

/*
create a method that can return the minimum number from an array of integers
 */