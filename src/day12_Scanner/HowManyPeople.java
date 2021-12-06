package day12_Scanner;

import java.util.Scanner;

public class HowManyPeople {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter how many people live with you?");
        int number = input.nextInt();

        input.close();

        String result =  (number<3)? "Live with less than 3 people"
                        :(number>=3&&number<=6)? "Live with 3 - 6 people"
                        : "Live with more than 6 people";

        System.out.println(result);

    }

}
