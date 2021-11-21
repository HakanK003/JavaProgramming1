package day11_SwitchScanner;

import java.util.Scanner;

public class GradeSwitch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your grade");
        char grade = input.next().charAt(0);
        String result;

        switch(grade){

            case 'A':
                result="Excellent";
                break;

            case 'B':
                result="Great Job";
                break;

            case 'C':
                result="Good";
                break;

            case 'D':
                result="Passed";
                break;

            case 'F':
                result="Failed";
                break;

            default:
                result="Grade";
                break;

        }

        System.out.println(result);





    }
}
