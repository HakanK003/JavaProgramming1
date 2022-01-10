package day24_CustumMethodsReturn;

public class PalindromeChecker {

    public static void main(String[] args) {

        String str1 ="Java";
        String str2 ="Level";

        System.out.println("str1 = " + isPalindrome(str1));
        System.out.println("str2 = " + isPalindrome(str2));

    }

    public static boolean isPalindrome(String str){
        boolean a =false;
        String reversed ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=str.charAt(i);
        }
        if (reversed.equalsIgnoreCase(str)){a=true;}
        return a;
    }
}

/*
 By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true
 */