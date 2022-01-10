package day26_CustomMethodPractice;

public class ReturnMaxNumberFromArrays {

    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6};
        System.out.println(maxNum(arr));
        double[] arr2={1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        System.out.println(maxNum(arr2));


    }

    public static int maxNum(int[] nums){

        int max = nums[0];

        for (int each : nums) {
            if (each>max){max=each;}
        }
        return max;
    }
    public static double maxNum(double[] nums){

        double max = nums[0];

        for (double each : nums) {
            if (each>max){max=each;}
        }
        return max;
    }
    public static long maxNum(long[] nums){

        long max = nums[0];

        for (long each : nums) {
            if (each>max){max=each;}
        }
        return max;
    }
    public static float maxNum(float[] nums){

        float max = nums[0];

        for (float each : nums) {
            if (each>max){max=each;}
        }
        return max;
    }
    public static byte maxNum(byte[] nums){

        byte max = nums[0];

        for (byte each : nums) {
            if (each>max){max=each;}
        }
        return max;
    }
    public static short maxNum(short[] nums){

        short max = nums[0];

        for (short each : nums) {
            if (each>max){max=each;}
        }
        return max;
    }
}

/*
 1. create a method that can return the max number from an integer array

    2. create a method that can return the max number from double array

    3. create a method that can return the max number from long array

    4. create a method that can return the max number from short array

    5. create a method that can return the max number from float array

    6. create a method that can return the max number from byte array
 */