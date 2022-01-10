package day25_CustomMethodsOverloading;

public class SumOfNumbers {

    public static void main(String[] args) {

        int a = 6;
        int b = 13;
        int c = 18;
        int d = 33;

        int sum1 = sum(a,b);
        int sum2 = sum(a,b,c);
        int sum3 = sum(a,b,c,d);

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
        System.out.println("sum3 = " + sum3);
    }

    public static int sum (int num1,int num2){
        int sum = num1+num2;
        return sum;
    }
    public static int sum (int num1, int num2, int num3){
        int sum =num1+num2+num3;
        return sum;
    }
    public static int sum (int num1, int num2, int num3, int num4){
        int sum =num1+num2+num3+num4;
        return sum;
    }
}

/*
Task1:
        1. create a method that can find the sum of two numbers
                        method name: sumOf2Numbers

        2. create a method that can find the sum of three numbers
                        method name: sumOf3Numbers

        3. create a method that can find the sum of four numbers
                        method name: sumOf4Numbers
 */