package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {

        char[]letters=new char[26];

        System.out.println(Arrays.toString(letters));

        for (char i= 'A', j=0; 'Z'>=i && j<letters.length; i++ , j++){
            letters[j]=i;
        }
        System.out.println(Arrays.toString(letters));

        /*
        for (char j= 'A', i=0; 'Z'>=j && i<letters.length; j++ , i++){
            letters[i]=(char)j;
        }
         */

        char ch = 'A';
        for (int i = 0; i< letters.length; i++,ch++){
            letters[i]= ch;
        }

        char ch2 = 'A';
        for (int i = 0; i< letters.length; i++){
            letters[i]= ch2++;
        }

        char ch3 = 'A';
        for (int i = 0; i< letters.length; i++){
            letters[i]= ch3;
            ch3++;
        }

    }
}
