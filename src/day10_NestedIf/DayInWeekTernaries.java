package day10_NestedIf;

public class DayInWeekTernaries {

    public static void main(String[] args) {

/*
       int a = 3;      //1~7

        String day;

        if (a == 1){
            day="Monday";       //System.out.println();
        }else if (a==2){
            day ="Tuesday";     //System.out.println();
        }else if (a==3){
            day ="Wednesday";   //System.out.println();
        }else if (a==4){
            day ="Thursday";    //System.out.println();
        }else if (a==5){
            day ="Friday";      //System.out.println();
        }else if (a==6){
            day ="Saturday";    //System.out.println();
        }else {
            day ="Sunday";      //System.out.println();
        }

        else{
            System.out.println("Invalid");      //not efficient
        }


        System.out.println("day = " + day);     // one println version

 */
        int a =5;

        String result = (a==1)?"Monday":(a==2)?"Tuesday":(a==3)?"Wednesday"
                        :(a==4)?"Thursday":(a==5)?"Friday":(a==6)?"Saturday":"Sunday";

        System.out.println(result);


    }
}
