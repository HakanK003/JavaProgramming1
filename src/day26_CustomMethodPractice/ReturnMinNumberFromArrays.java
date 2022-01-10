package day26_CustomMethodPractice;

public class ReturnMinNumberFromArrays {
    public static void main(String[] args) {
        int[] arr={2, 3, 4, 5, 6, 1};
        System.out.println(minNum(arr));
        double[] arr2={2.2, 3.3, 4.4, 5.5, 6.6, 1.1};
        System.out.println(minNum(arr2));


    }

    public static int minNum(int[] nums){

        int min = nums[0];

        for (int each : nums) {
            if (each<min){min=each;}
        }
        return min;
    }
    public static double minNum(double[] nums){

        double min = nums[0];

        for (double each : nums) {
            if (each<min){min=each;}
        }
        return min;
    }
    public static long minNum(long[] nums){

        long min = nums[0];

        for (long each : nums) {
            if (each<min){min=each;}
        }
        return min;
    }
    public static float minNum(float[] nums){

        float min = nums[0];

        for (float each : nums) {
            if (each<min){min=each;}
        }
        return min;
    }
    public static byte minNum(byte[] nums){

        byte min = nums[0];

        for (byte each : nums) {
            if (each<min){min=each;}
        }
        return min;
    }
    public static short minNum(short[] nums){

        short min = nums[0];

        for (short each : nums) {
            if (each<min){min=each;}
        }
        return min;
    }
}

/*
 1. create a method that can return the min number from an integer array

    2. create a method that can return the min number from double array

    3. create a method that can return the min number from long array

    4. create a method that can return the min number from short array

    5. create a method that can return the min number from float array

    6. create a method that can return the min number from byte array
 */