package day08_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Josh";
        int age = 38;
        String citizen ="USA";

        boolean isEligible = age>=21 && citizen == "USA";

        if (isEligible){    //True
            System.out.println("Eligible");
        }

        if (!isEligible){   //!True ==> not true ==> false
            System.out.println("Not Eligible");
        }













    }


}
