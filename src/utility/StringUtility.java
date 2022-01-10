package utility;

import java.util.Arrays;
import java.util.Locale;

public class StringUtility {

    //prints each char of string new lines
    public static void printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {

            System.out.println(str.charAt(i));
            
        }
    }

    //returns reverse version of string from given string
    public static String reverse(String str){

        String result = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }

        return result;
    }

    //return true if it's palindrome else returns false
    public static boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);
    }

    //if the given string is anagram returns true else false
    public static boolean isAnagram(String str1 ,String str2){
        char[] ch1 =str1.toCharArray();
        char[] ch2 =str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }

    //remove duplicates
    public static String removeDuplicated(String str){
        String result ="";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.charAt(i)+"")){result+=str.charAt(i);}
        }
        return result;
    }

}
