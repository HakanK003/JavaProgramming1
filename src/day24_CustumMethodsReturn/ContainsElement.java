package day24_CustumMethodsReturn;

public class ContainsElement {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6};

        System.out.println(containsElement(nums,6));

    }

    public static boolean containsElement(int[] arr , int element){
        boolean contains =false;
        for (int each : arr) {
            if (each==element){contains=true;}
        }
        return contains;
    }
}

/*
 Create a method named contains that passes one integer array and one integer parameters,
 the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false
 */