package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindLargestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 2, 6, 5, 6, 7));
        int n = 3;
        int max = 0;

        for (int i = 1; i < n; i++) {
            max = Collections.max(list);
            list.removeAll(Arrays.asList(max));
        }
        System.out.println(Collections.max(list));


/*
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        int n =5;

        String result="";

        while(!numbers.isEmpty()){

            int max = numbers.get(0);

            for (Integer each : numbers){if(each>max){max=each;}}

            if (!result.contains(""+max)) {result += "" + max;}

            int finalMax = max;

            numbers.removeIf(p -> p == finalMax);

        }

        System.out.println(result.charAt(n-1));
 */

}

}
