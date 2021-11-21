package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {

        int a=33,
            b=35,
            c=30;

        // if we have three different numbers, one MUST be maximum, one MUST be minimum, and  one MUST be median

        boolean aIsMedian = (a> b && a<c) || (a<b &&a>c);

        boolean bIsMedian = (b>a && b<c) || (b>c &&b<a);

        boolean cIsMedian = !aIsMedian && !bIsMedian;


        if (aIsMedian){     //if a is median number
            System.out.println(a + " is the median number");
        }

        if (bIsMedian){     //if b is the median number
            System.out.println(b + " is the median number");
        }

        if (cIsMedian){     //if c is the median number
            System.out.println(c + " is the median number");
        }


    }
}
/*
 Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */
