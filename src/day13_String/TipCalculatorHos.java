package day13_String;

import java.util.Scanner;

public class TipCalculatorHos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the check amount:");
        double check = input.nextDouble();
        input.nextLine();

        System.out.println("Split or not split? (Yes/No)");
        String split = input.nextLine();

        int people;
        if (split.equalsIgnoreCase("yes")){
            System.out.println("Number of people");
            people= input.nextInt();
            input.nextLine();
        }else{people = 1;}

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String quality = input.nextLine();

        input.close();

        double totalPay;
        double totalTip;

             if (quality.equalsIgnoreCase("Excellent")) {totalPay=check+check/100*25;totalTip=check/100*25;}
        else if (quality.equalsIgnoreCase("Great"))     {totalPay=check+check/100*20;totalTip=check/100*20;}
        else if (quality.equalsIgnoreCase("Good"))      {totalPay=check+check/100*15;totalTip=check/100*15;}
        else if (quality.equalsIgnoreCase("Fair"))      {totalPay=check+check/100*10;totalTip=check/100*10;}
        else                                                       {totalPay=check+check/100*5 ;totalTip=check/100*5;}

        double totalPerson= totalPay/people;
        double tipPerPerson=totalTip/people;

        System.out.println(   "Number of people:"     + people
                            + "\nTotal to pay: "      + totalPay
                            + "\nTotal tip: "         + totalTip
                            + "\nTotal per person: "  + totalPerson
                            + "\nTip per person: "    + tipPerPerson);






    }
}

/*
Create a class called TipCalculator, write a program for a tip
calculator.
There will be different service quality benchmarks that will determine the
tip given.
There will also the ability to calculate based on the number of people in
the party and if there is a split of the bill or not.
Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent
= 25%
The program should display the following information based on the
user input:
Split or No split (Yes or No),  Number of people entered: (number)
(each person = & in output) Check amount: (number) Service Quality:
(String) Total to pay: Total tip: Total per person: Tip per person:
Ex:
Split or No split (Yes or No)?
Yes
Enter the number of people
4
Enter the check amount:
476
How was the srvice quality?
(Excellent/Great/Good/Fair/Poor)
Excellent
output:
Number of people entered: 4
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
HINT: you will need to use .equals() method
 */