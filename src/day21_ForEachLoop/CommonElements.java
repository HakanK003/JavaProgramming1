package day21_ForEachLoop;

public class CommonElements {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        String result = "";

        for (int eachArr1 : arr1) {

            for (int eachArr2 : arr2) {

                if (eachArr1==eachArr2){result+=eachArr1+" ";}

            }

        }

        System.out.println(result.trim());


    }
}

/*
Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops
 */