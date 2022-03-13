package day24_CustumMethodsReturn;

public class ContainsElement {


    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6};
        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

//        boolean result1 = containsElement(nums,6);
//
//        System.out.println(containsElement(nums2,9));


        containsElementVoid(nums, 7);

    }


    public static boolean containsElement(int[] arr , int element){
        boolean contains =false;
        for (int each : arr) {
            if (each==element){contains=true;}
        }
        return contains;
    }


    public static void containsElementVoid(int[] arr , int element){

        for (int each : arr) {
            if (each==element){
                System.out.println("Array contains element");
            }else{
                System.out.println("We have check with "+each+ " Array doesn't contains "+ element);
            }
        }

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