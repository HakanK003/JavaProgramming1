package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println("12" + 1);

        System.out.println(10 + 20); // 30,
        System.out.println(100 - 50); // 50,
        System.out.println(10 * 6); // 60,

        int a = 100;
        double b = a/6 ; //16.0 (this is a double) equal to double b = 16; will print 16.0

        System.out.println(b);

        double c = a/6d ; //if we want 16.6666... we should do 6.0 or 6d or 6D or (double)a

        System.out.println(c);

        System.out.println( 100D ); // it converted to decimal so result is 100.0


    }

}

/*

+: Addition
-: Subtract
*: Multiplication
/: Division
      in math:
            10/4= 2.5
            100/3=33.3333...

      in java:
            10/4= 2   (because these are integer)
            100/3= 33
            10.0/4=2.5 ( if we want decimal one of them should be decimal or casted or ad after number a d/D  )

            integer / integer = integer
            integer / decimal = decimal
            decimal / integer = decimal
            decimal / decimal = decimal

%: Remainder

 */