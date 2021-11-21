package day10_NestedIf;

public class GradeReport2 {

    public static void main(String[] args) {

        /*
        90 ~ 100 : Excellent
        80 ~ 89  : Great
        70 ~ 79  : Good
        60 ~ 69  : Passed
        0 ~ 59   : Failed
         */

        int score = 95;
        String result =""; // temporary use like this =""; for canceling compiler error then clear =""

        if (score >=0 && score<=100){   // primer condition passes to next conditions implicitly

            if(score>=90){  // no need to say 100>=score it's already checked
                result ="Excellent";
            }else  if(score>=80){   // no need to say &&score<=89 it's already false
                result ="Great";
            }else  if(score>=70){   // no need to say &&score<=79 it's already false
                result ="Good";
            }else  if(score>=60){   // no need to say &&score<=69 it's already false
                result ="Passed";
            }else {
                result ="Failed";
            }

        }else{
            result ="Invalid score";
        }



        System.out.println(result);



    }
}
