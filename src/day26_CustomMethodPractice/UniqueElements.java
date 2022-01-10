package day26_CustomMethodPractice;

import utility.ArrayUtility;

public class UniqueElements {

    public static void main(String[] args) {



    }

    public static int[] uniqueElementArray (int[] arr){

        int[] result = {};
        for (int each : arr) {
            if (ArrayUtility.frequencyOfElement(arr,each)==1)
            {result = ArrayUtility.elementAdder(arr,each);}
        }
        return result;
    }

}
