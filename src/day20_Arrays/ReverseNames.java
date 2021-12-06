package day20_Arrays;

import java.util.Scanner;

public class ReverseNames {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] classmates = new String[10];

        System.out.println("Enter 10 names");

        for (int i = 0; i < classmates.length; i++) {
            classmates[i]= input.nextLine();
        }

        for (int i = 0; i < classmates.length; i++) {

            String reversed ="";

            for (int j = classmates[i].length()-1; j>=0 ; j--) {

                reversed+=classmates[i].charAt(j);


            }

            System.out.println(reversed);

        }




    }
}

/*
create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */