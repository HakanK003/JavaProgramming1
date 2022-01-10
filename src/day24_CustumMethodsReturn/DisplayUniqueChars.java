package day24_CustumMethodsReturn;

public class DisplayUniqueChars {

    public static void main(String[] args) {

        String str ="Hakankar";
        uniqueFinder(str);
    }

    public static void uniqueFinder(String str){

        String result="";
        char[] charList = str.toCharArray();
        for (char eachCh : charList) {
            int count =0;
            for (char checker : charList) {
                if (eachCh==checker){count++;}
            }
            if (count==1){result+=eachCh;}
        }
        System.out.println(result);
    }
}

/*
 create a method that can display the unique characters of a string
 */