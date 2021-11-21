package day06_PrimitiveTypeCastings;

public class PrimitiveCasting {

    public static void main(String[] args) {

        byte a = 100;
        short b = a;  // background (short)a;
        long c = a;   // background (long)a;


        int x = (int)c ;



        long j = 10000000;   // if it is in int range we can use without L or l
        short k = (short) j; // will not give same number if it's out of the range

        System.out.println(j + " : " + k);



        double l = 2.5;
        float m = (float)l ;

        // we can do like int x = (int)(long)y [first casted to long then casted to int] we can just use (int)


        double d1 = 20.5;
        short s1 = (short) d1;  // alt+enter or click red line for shortcut of correction

        System.out.println(d1+" : "+s1); //short bring only integer part

        float f1 = 30.5F;
        long l1 = (long) f1;















        }


    }


// double > float > long > int > short > byte

/*
    if smaller to larger it is implicit

    if larger to smaller it should be explicitly
 */