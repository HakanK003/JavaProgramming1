package day09_IfStatements;

public class GradeLevelDetermine {
    public static void main(String[] args) {

        byte number=12;

        if (number<=5){
            System.out.println("Elementary School");
        }else if (number<=8){
            System.out.println("Middle School");
        }else if (number<=12){
            System.out.println("High School");
        }else if (number<=16){
            System.out.println("College");
        }else {
            System.out.println("Grad School");
        }
    }
}

/*
 Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

            Assume that the given number is 1 ~ 18
 */