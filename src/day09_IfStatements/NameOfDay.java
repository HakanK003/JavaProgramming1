package day09_IfStatements;

public class NameOfDay {
    public static void main(String[] args) {

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
/*
        else{
            System.out.println("Invalid");      //not efficient
        }
*/

        System.out.println("day = " + day);     // one println version


    }
}
