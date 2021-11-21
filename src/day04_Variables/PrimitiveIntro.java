package day04_Variables;

public class PrimitiveIntro {

    public static void main(String[] args) {

        // variable name has to be readable and meaningful

        byte age = 38; // age 38
        short weight = 160; // weight 160 pounds
                            //160 is out of the byte' range
                            // 160 is within the range of short

        //salary: 100000 $
        int salary = 100000; // int is the preferred data type for integer numbers
//we can use _ for 100_000 instead of , (for making readable)

        long asset = 3_333_333_333L; // you must add l or L for take number as a long (we are  forcing it because int is preferred)

        float tax = 0.26F; //double is the preferred so we have to force with f or F



        boolean isEmployeed = true;
        boolean isMarried = false;
        boolean result = 100>300;

        System.out.println("result = " + result);
        System.out.println("isMarried = " + isMarried);
        System.out.println("isEmployeed = " + isEmployeed);


        String name = "Wooden Spoon";
        String city ="Virginia";

//in same package class names should be different/unique, we can use in another package

/*
            for variable name we can use only $ and _
            we can't use space
            preferred to start with a lowercase letter, it is ok if it starts with uppercase
            we can't use some keywords that reserved by java (can't be exact java reserved word, it can include)
            one variable name isn't reusable (must be unique)
            use camelCase
            can't start with digits, we can use after
            variable name must be readable, meaningful and understandable
 */

 /*
        ! How to change variable name into everywhere we wrote !

        1-Ctrl+R or Ctrl+m+r
        2-write old variable name
        3-write new variable name
        4-click replace all
 */

    }
}
