package practice2_12_08_2021;

import java.util.Scanner;

public class SwitchAnimalDetect {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Animal name");
        String str = input.nextLine().toLowerCase();

        String result;

        switch (str){
            case "dog":
            case "cat":
                result="Domestic Animal";
                break;
            case "tiger":
                result="Wild Animal";
                break;
            default:
                result="Unknown animal";
        }

        System.out.println(str+" is "+result);


    }
}

/*
Create  a program that accepts animal as String

                            DOG     - domestic animal
                            CAT     - domestic animal
                            TIGER     - wild  animal

                            For other animal - unknown animal

                            INPUT : DOG         EXPECTED OUTPUT : DOG is domestic animal
*/
