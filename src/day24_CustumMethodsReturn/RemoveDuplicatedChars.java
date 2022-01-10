package day24_CustumMethodsReturn;

public class RemoveDuplicatedChars {

    public static void main(String[] args) {

        String str = "aabbc11223";
        duplicateRemover(str);
    }

    public static void duplicateRemover(String str){

        String result="";

        for (int i = 0; i < str.length(); i++) {
           if (!result.contains(str.charAt(i)+"")){result+=str.charAt(i);}

        }
        System.out.println(result);
    }
}

/*
create a method that can remove duplicated characters from a string and returns the new value
 */