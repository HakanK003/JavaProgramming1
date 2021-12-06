package day15_ForLoop;

import java.util.Locale;

public class StringMethods5 {

    public static void main(String[] args) {

        String str =" ";

        boolean r = str.isEmpty();

        System.out.println(r);
        //has nothing

        boolean r1 = str.isBlank();
        //can has "     "
        System.out.println(r1);

        // if we give "" for variable both of them are true

        String str2 = "Cydeo     ";

        System.out.println(str2.isBlank());

        System.out.println("----------------------------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));    //false
        System.out.println(s1.equalsIgnoreCase(s2));  //true

        System.out.println("yEs".equals("Yes"));
        System.out.println("yEs".equalsIgnoreCase("Yes"));

        System.out.println("----------------------------------------------------");

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");  //false
        boolean haasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");               // we can't use ignoreCase with contains
        boolean hasJava3 = sentence.toLowerCase().contains("java"); //only way to ignore case sensitivity
        boolean hasJava4 = sentence.contains("java")||sentence.contains("Java");// can't recognize jAva ...

        System.out.println("hasCSharp = " + hasCSharp);
        System.out.println("haasJava = " + haasJava);
        System.out.println("hasJava2 = " + hasJava2);
        System.out.println("hasJava3 = " + hasJava3);
        System.out.println("hasJava4 = " + hasJava4);

        System.out.println("-----------------------------------------------------");

        String input1 = "I love JAvA";
        String input2 = "Java";

        System.out.println(input1.equals(input2));  //false
        System.out.println(input1.equalsIgnoreCase(input2));  //false

        System.out.println(input1.contains("Java"));  //false

        System.out.println(input1.toLowerCase().contains("java"));  // true
        System.out.println(input1.toUpperCase().contains("JAVA"));  // true

        System.out.println("-----------------------------------------------------");

        String a = "Wooden Spoon";

        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().startsWith("wooden");

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


    }
}
