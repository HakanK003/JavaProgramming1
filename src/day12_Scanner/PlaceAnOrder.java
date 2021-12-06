package day12_Scanner;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter product name");
        String product = input.nextLine();

        System.out.println("Enter the price");
        double price = input.nextDouble();

        System.out.println("Enter quantity");
        int quantity = input.nextInt();

        System.out.println("Enter your first name");
        input.nextLine();
        String name = input.nextLine();

        input.close();

        System.out.println(name+", you order for "+quantity+" "+product+" has been places.\nYour total is "+(quantity*price)+".");


    }
}

/*
PlaceAnOrder task:
Ask User to enter the prodcut name (multiple words)
Ask the user to enter the price  (double)
Ask the user to enter the quantity (int)
Ask the user to enter their first name (String, single
word)
Print in the following format:
Ex:
Input: "Apples" , 1.5, 5. "Luke"
Output:
Luke, your order for 5 Apples has been places.
Your total is 7.5.
 */