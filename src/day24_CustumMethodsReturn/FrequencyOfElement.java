package day24_CustumMethodsReturn;

public class FrequencyOfElement {

    public static void main(String[] args) {

        int[] nums ={1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 1, 2, 3, 1, 1, 1, 1};
        System.out.println("There are "+ frequencyOfElement(nums,1)+" times");

    }

    public static int frequencyOfElement(int[] arr,int num){
        int count =0;
        for (int each : arr){
            if (each==num){count++;}
        }
        return count;
    }
}

/*
create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5
 */