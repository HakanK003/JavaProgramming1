package day24_CustumMethodsReturn;

public class MaxNumFromArray {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6};
        maxNumFinder(numbers);

    }

      public static void maxNumFinder(int[] nums){

        int max = nums[0];

          for (int each : nums) {
              if (each>max){max=each;}
          }
          System.out.println(max);
      }
}

/*
create a method that can return the maximum number from an array of integers
 */