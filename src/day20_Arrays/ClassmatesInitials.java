package day20_Arrays;

import java.util.Scanner;

public class ClassmatesInitials {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter full names of classmate's");

        String[] classmates = new String[10];

        for (int i = 0; i < classmates.length; i++) {
            classmates[i]= input.nextLine();
        }

        for (int i = 0; i < classmates.length; i++) {
            System.out.println(classmates[i].charAt(0)+" "+classmates[i].charAt(classmates[i].indexOf(" ")+1));
        }


    }
}

/*
create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmate's in separate lines
 */