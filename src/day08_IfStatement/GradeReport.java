package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {

        int score=85;

        boolean a= score>=90 && score<=100;
        boolean b= score>=80 && score<=89;
        //boolean b= score>=80 && !a;                       //     another solution
        boolean c= score>=70 && score<=79;
        //boolean b= score>=70 && !a && !b;                 //     another solution
        boolean d= score>=60 && score<=69;
        //boolean b= score>=60 && !a && !b && !c;           //      another solution
        boolean f= score>=0 && score<=59;
        //boolean b= !a && !b && !c && !d;                  //      another solution


        if (a) {    //If the student made an A
            System.out.println("Excellent");
        }

        if (b){     //If the student made a B
            System.out.println("Great");
        }

        if (c){     //If the student made a C
            System.out.println("Good");
        }

        if (d){     //If the student made a D
            System.out.println("Passed");
        }

        if (f){     //If the student made an F
            System.out.println("Failed");
        }



    }
}

/*

    90 ~ 100 ==> Excellent
    80 ~ 89 ==> Great
    70 ~ 79 ==> Good
    60 ~ 69 ==> Passed
    0 ~ 59 ==> Failed
 */


