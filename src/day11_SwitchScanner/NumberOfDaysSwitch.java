package day11_SwitchScanner;

import java.util.Scanner;

public class NumberOfDaysSwitch {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter number of month (1~12)");
        int number = input.nextInt();

        System.out.println("Enter year");
        int year = input.nextInt();

        String result;

        if (number>=1&&number<=12){

            switch (number){

                case 2:
                    result=(year%4==0)? "29 days":"28 days";
                    break;

                case 4: case 6: case 9: case 11:
                    result="30 days";
                    break;

                default:
                    result="31 days";


            }

        }else{
            result="Invalid Number";
        }

        System.out.println(result);

    }
}
