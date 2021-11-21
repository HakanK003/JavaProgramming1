package day09_IfStatements;

public class GradeReport2 {

    public static void main(String[] args) {

        int score= 75;

        if (score>=90){
            System.out.println("Excellent");
        }else if(score>=80){
            System.out.println("Great");
        }else if(score>=70){
            System.out.println("Good");
        }else if(score>=60){
            System.out.println("Passed");
        }else{
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
