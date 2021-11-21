package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {

        //  >, >=, <, <=,

        boolean result1 = 200 > 40;       //false

        System.out.println("result1 = " + result1);

        boolean result2 = 300>=150;       //true

        System.out.println("result2 = " + result2);

        boolean result3 = 100>=100;       //true

        System.out.println("result3 = " + result3);

        boolean result4 = 300>=500;       //false

        System.out.println("result4 = " + result4);

        // credit score of 720
        int creditScore = 745;

        boolean isEligibleForLoan = creditScore >= 720; //if the credit score is 720 or grater then 720 is eligible

        boolean result5 = 100<120;         //true
        System.out.println("result5 = " + result5);

        boolean result6 = 200<180;         //false
        System.out.println("result6 = " + result6);

        int score = 59;
        boolean hasFail = score <= 59;
        //         score<59 || 59=59 => fail  (true)
        //         score>59 => pas  (false)
        System.out.println("hasFail = " + hasFail);

        boolean result7 = 45 <=60;

        System.out.println("result7 = " + result7);

        System.out.println("-----------------------------------------------------------------------------------------");

        int x = 100;
        int y = 200;

        boolean equal = x==y;   //false
        //             100==200

        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar"=="Good Guy"; //false

        System.out.println("result8 = " + result8);

        boolean result9 = 'A'=='a';             //false

        System.out.println("result9 = " + result9);

        boolean result10 = "Java"=="java";     //false

        System.out.println("result10 = " + result10);

        boolean result11 = "Java"=="Java";     //true

        System.out.println("result11 = " + result11);

        boolean result12= "Java"=="Java ";     //false  (there is a "  ")

        System.out.println("result12 = " + result12);

        System.out.println("-----------------------------------------------------------------------------------------");

        //if we wwant to compare we have to use two numbers or two letters not letter=||!=number

        boolean result13 = 100 != 200;         //true

        System.out.println("result13 = " + result13);

        boolean result14 = "Java" != "Break";  //true

        System.out.println("result14 = " + result14);

        boolean result15 = 300 != 300;        //false
        System.out.println("result15 = " + result15);

        boolean result16 = 200 != 200.0;      //false    (actually they are equal)
        System.out.println("result16 = " + result16);

        System.out.println("-----------------------------------------------------------------------------------------");







    }
}
