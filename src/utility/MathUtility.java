package utility;

public class MathUtility {

    public static void main(String[] args) {
        System.out.println(sumOfNums(6,3));
        System.out.println(sumOfNums(3.3,6.6));
        System.out.println(subtractionOfNums(6,3));
        System.out.println(subtractionOfNums(6.6,3.3));
        System.out.println(multiplicationOfNums(3,6));
        System.out.println(multiplicationOfNums(3.3,6.6));
        System.out.println(divisionOfNums(6,3));
        System.out.println(isEven(3));
        System.out.println(isOdd(3));
        System.out.println(maxNumBetween2Num(3,6));
        System.out.println(maxNumBetween2Num(3.3,6.6));
        System.out.println(minNumBetween2Num(3,6));
        System.out.println(minNumBetween2Num(3.3,6.6));
        System.out.println(squareOfNum(3));
        System.out.println(squareOfNum(3.3));
        System.out.println(cubeOfNum(3));
        System.out.println(cubeOfNum(3.3));

    }

    public static int sumOfNums(int num1,int num2){
        return num1+num2;
    }
    public static double sumOfNums(double num1,double num2){
        return num1+num2;
    }

    public static int subtractionOfNums(int num1,int num2){
        return num1-num2;
    }
    public static double subtractionOfNums(double num1,double num2){
        return num1-num2;
    }

    public static int multiplicationOfNums(int num1,int num2){
        return num1*num2;
    }
    public static double multiplicationOfNums(double num1,double num2){
        return num1*num2;
    }

    public static double divisionOfNums(double num1,double num2){
        return num1/num2;
    }
    public static boolean isEven(int num){
        return (num%2==0);
    }
    public static boolean isOdd(int num){
        return (num%2!=0);
    }

    public static int maxNumBetween2Num(int num1, int num2){
        int result=0;
        if (num1>num2){result=num1;}else{result=num2;}
        return result;
    }
    public static double maxNumBetween2Num(double num1, double num2){
        double result=0;
        if (num1>num2){result=num1;}else{result=num2;}
        return result;
    }
    public static int minNumBetween2Num(int num1, int num2){
        int result=0;
        if (num1<num2){result=num1;}else{result=num2;}
        return result;
    }
    public static double minNumBetween2Num(double num1, double num2){
        double result=0;
        if (num1<num2){result=num1;}else{result=num2;}
        return result;
    }

    public static int squareOfNum(int num){
        return num*num;
    }
    public static double squareOfNum(double num){
        return num*num;
    }

    public static int cubeOfNum(int num){
        return num*num*num;
    }
    public static double cubeOfNum(double num){
        return num*num*num;
    }
}

/*
2.1 Create a method that can return the sum of two integers
            2.2 Create a method that can return the sum of two decimal numbers

            2.3 Create a method that can return the subtraction of two integers
            2.4 Create a method that can return the subtraction of two decimals

            2.5 Creat a method that can return the multiplication of two integers
            2.6 Create a method that can return the multiplication of two decimals

            2.7 Create a method that passes two double parameters and return the division reslt

            2.8 Create a method that can check if an integer is even number
            2.9 Create a method that can check if an integer is odd number

            2.10 Create a method that can return the maximum number between two integers
            2.11 Create a method that can return the maximum number between two decimal numbers

            2.12 Create a method that can return the minimum number between two integers
            2.13 Create a method that can return the minimum number between two decimal numbers

            2.14 Create a method that can return the square of an integer
                    Ex: square(2) ==> 4
            2.15 Create a method that can return the square of a double

            2.16 Create a method that can return the cube of an integer
            2.17 Create a method that can return the cube of a double
 */