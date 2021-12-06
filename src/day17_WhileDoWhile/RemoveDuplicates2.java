package day17_WhileDoWhile;

public class RemoveDuplicates2 {

    public static void main(String[] args) {

        String str = "AABBCC";

        String result = "";

        for (int i=0; i<str.length(); i++){
            String ch = ""+str.charAt(i);   //"A", "A", "B", "B", "C", "C"
            if (result.contains(ch)){continue;}//skip
            result+=ch;
        }
        System.out.println("result = " + result);


    }
}
