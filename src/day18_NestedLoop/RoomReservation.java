package day17_NestedLoop;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int totalPrice=0;

        String answer="";

        do {
            System.out.println("Which bedroom do you want to reserve? (King Bed/Queen Bed/Single Bed)");
            String type= input.nextLine();
            if (type.equalsIgnoreCase("King Bed")){totalPrice+=120;}
            if (type.equalsIgnoreCase("Queen Bed")){totalPrice+=100;}
            if (type.equalsIgnoreCase("Single Bed")){totalPrice+=80;}
            System.out.println("Would you like to reserve another room?");
            answer= input.nextLine();
            while (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
                System.out.println("Invalid answer");
                System.out.println("Would you like to reserve another room?");
                answer= input.nextLine();
            }


        }while(answer.equalsIgnoreCase("yes"));

        System.out.println(totalPrice+"$");

    }
}

/*
 Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

 */