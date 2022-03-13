package practice3_12_15_2021;

public class WhatIsMirrored {

    public static void main(String[] args) {

        String str = "abcba";
        String result = "";

        for (int i = 0, j = str.length()-1; i < str.length(); i++, j--) {

            if  (str.charAt(i)==str.charAt(j))
                {result+=str.charAt(i);}
            else
                {break;}

        }

        System.out.println(result);
/*
        String reversed = "";

        String result="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=str.charAt(i);
        }

        for (int i = 0; i < str.length(); i++) {

            if ( str.charAt(i)==reversed.charAt(i) ) {
                result+=str.charAt(i);
            } else {
              break;
            }

        }

        System.out.println(result);
 */




/*

        String result ="";
        for (int i = 0, j= str.length()-1; i<(str.length()+1)/2 ; i++,j--) {

            if (str.charAt(i)==str.charAt(j)){result+=str.charAt(i);}

        }

        System.out.println(result);
 */

    }
}

/*
           Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
           In other words, zero or more characters at the very beginning of the given string, and at the very end of the
           string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".

                  mirrorEnds("abXYZba") → "ab"
                  mirrorEnds("abca") → "a"
                  mirrorEnds("aba") → "aba"
*/