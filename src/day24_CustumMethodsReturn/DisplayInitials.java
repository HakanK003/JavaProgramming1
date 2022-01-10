package day24_CustumMethodsReturn;

import java.util.Scanner;

public class DisplayInitials {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter full name");
        String fullName = input.nextLine();
        input.close();

        initialsOfFullName(fullName);

    }

    public static void initialsOfFullName(String fullName){

        String[] str = fullName.split(" ");
        String result="";
        for (String each: str){
            result+=each.charAt(0)+" ";
        }
        System.out.println(result.trim());
    }
}

/*
Create a method that can display the initials of the person
 */