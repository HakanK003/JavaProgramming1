package day10_NestedIf;

import java.util.Scanner;

public class NameOfMonthsTernaries {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

            System.out.println("Enter a number between 1~12");
            int number = input.nextInt();

        String result = number ==1? "January" :number ==2? "February" :number ==3? "March"
                        :number ==4? "April" :number ==5? "May" :number ==6? "June"
                        :number ==7? "July" :number ==8? "August" :number ==9? "September"
                        :number ==10? "October" :number ==11? "November" : "December";

        // in ternaries using () is optional but for making readable we must use ()

            System.out.println(result);



    }

}
