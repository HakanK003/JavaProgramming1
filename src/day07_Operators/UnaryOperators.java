package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = +3;
        int num2 = -2;

        System.out.println( num1 < 0 ); //false
        System.out.println( num2 < 0 ); //true

        System.out.println("-----------------------------------");

         int a = 5;
         ++a;


        System.out.println(a);

        System.out.println("----------------------");

        int b = 100 ;

        System.out.println(++b); //pre increment: increases the value by 1 right away (has one step)

        int c = 100 ;

        System.out.println(c++); //post increment: increases the value by 1 next step (has two steps)
        System.out.println(c);   //101 for c value

        System.out.println("---------------------------------------------");

        int x = 200;

        System.out.println( --x); //pre decrement: decreases the value by 1 right away (has one step)

        int y = 100;

        System.out.println( y--); //post decrement: decreases the value by 1 in next step (has two steps)
        System.out.println( y);   //199

        System.out.println("----------------------------------------------");

        int z = 45;

        System.out.println( ++z);  // 46, z=46      (has one step)
        System.out.println( z--);  // 46; z=47      (has two steps)
        System.out.println( z);    // 47

        int q = 30;

        System.out.println( --q);  // 29, q = 29    (has one step)
        System.out.println( q--);  // 29, q = 29    (has two steps)
        System.out.println( q);    // 28






    }
}
/*
Summary:
++: increase the value by 1.
- - : decreases the value by 1.
Post vs Pre:
Pre : changes the value immediately
post: changes the value in the second step.

 */