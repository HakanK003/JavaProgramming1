package day25_CustomMethodsOverloading;

public class ReturnMaxInDifferentVersions {

    public static void main(String[] args) {
        
        
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

    
    
    
}

/*

 */