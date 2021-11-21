package day09_IfStatements;

public class VoteEligibility {

    public static void main(String[] args) {

        String name="Harry";
        int age=3;
        String country="USA";

        boolean isEligible= age>=18&&country=="USA";

        if (isEligible){
            System.out.println(name + " is eligible for vote");
        }else{
            System.out.println(name + " is not eligible for vote");
        }



    }
}

/*
Write a program that can check if the person is eligible to vote
 */