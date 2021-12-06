package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice3ZtoA {
    public static void main(String[] args) {

        char[] zToA = new char[26];

        for (int i= 0, ch = 'Z' ; i<=zToA.length-1; i++,ch--){
            zToA[i]= (char) ch;
        }

        System.out.println(Arrays.toString(zToA));





    }
}
