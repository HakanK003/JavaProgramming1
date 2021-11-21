package day09_IfStatements;

public class BuyEligible {
    public static void main(String[] args) {

        String name ="Harry";
        int age =20;

        boolean isEligible= age>=18;

        if (isEligible){
            System.out.println(name + " is eligible to buy alcohol");
        }

    }
}

/*
Write a program that can check if the person is eligible to buy alcohol
 */