package day53_FunctionalInterface;

import java.util.List;

public class LambdaExpressions {

    public static void main(String[] args) {

//        MyThirdFunctionalInterface<String> stringReverse =
//                (s) -> {
//                    String reverse = new StringBuilder(s).reverse().toString();
//                    return reverse;
//                };
//
//        String result = stringReverse.method("Wooden Spoon");
//
//        System.out.println("result1 = "+result);
//
//
//        String result2 = stringReverse.method("Java");
//
//        System.out.println("result2 = " + result2);
//
//        //create a function that can return the cube of an integer


        MyThirdFunctionalInterface<Integer> findCube =
                (n) -> {

                Integer cube = n *n* n;

               return cube;

        };

        int cubeOfThe3 = findCube.method(3);

        System.out.println("cubeOfThe3 = " + cubeOfThe3);


//        int number5 = 3;
//
//        int cubeOfNumber5 = findCube(number5);
//
//        System.out.println("cubeOfNumber5 = " + cubeOfNumber5);
//



    }


    public static int findCube (int n){

        int cube = n *n* n;

        return cube;
    }


}