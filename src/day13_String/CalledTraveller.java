package day13_String;

import java.util.Scanner;

public class CalledTraveller {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Have you got a valid passport? (yes/no)");
        String passport = input.nextLine();

        if (passport.equalsIgnoreCase("yes")) {
            int ticket=1000;
            System.out.println("Which country you want to travel?");
            String country = input.nextLine();

            System.out.println("How many bags you will take with you?");
            byte bags= input.nextByte();

            ticket +=bags*50;

            System.out.println("How many people will travel?");
            short people = input.nextShort();

            if (people<=3){ticket -=people*100;}else{ticket -=300;}
            System.out.println("Enter names of the travellers (separate by comma)");
            input.nextLine();
            String names = input.nextLine();

            System.out.println("Your ticket is booked to " +country+
                    ". We have charged extra for the "+bags+" bags but you are traveling with "+people+
                    " persons so we are giving a discount. Your total cost is $"+ticket);
        }
        else if(passport.equalsIgnoreCase("no")) {
            int costAmount=1200;
            System.out.println("How many years ago your passport expired?");
            int yearAgo= input.nextInt();
            costAmount+=yearAgo*75;
            System.out.println("Which country you want to travel?");
            input.nextLine();
            String country = input.nextLine();
            System.out.println("Will you travel next year? (yes/no)");
            String answer= input.nextLine();
            if (answer.equalsIgnoreCase("yes")){costAmount +=100;}
            else if(answer.equalsIgnoreCase("no")){costAmount -= 50;}else{
                System.out.println("Invalid answer");}
                System.out.println("Looks like your passport has been expired for " +
                       yearAgo+" years, but not to worry we will get it ready for you to travel to "+
                        country+". Your total cost has come out to $"+costAmount);

        }
        else{
            System.out.println("Invalid answer");
        }
    }
}

/*
Create a class calledTravel. Make a cost variable to calculate how
much the person will owe after everything.
Ask the user if they have a valid passport (yes or no)
If the user enters yes:
The base cost of the ticket
should be set to: 1000
Ask the user the country they to travel to
(String, multiple word)
Ask the user how many bags they will take
with them (byte)
> Each bag will add 50 to the cost
Ask the user how many people they will travel
with (short)
> For each person the cost is
reduced by 100. Up to a limit of 300.
Ask the user to Enter the name of the people
they will travel with in one line, separating each name with a comma
(String, multiple word)
Print: "Your ticket is booked to
$countryName. We have charged extra for the $numberOfBags bags but you are
traveling with $peopleYouTravelWith so we are giving a discount. Your
total cost is $costAmount"
If the user enters no:
The base cost of the passport
renewal is: 200
            Ask the user when their passport
expired(int)
                > Each year it was
expired adds 75 to the cost
Ask the user which country they plan to
travel
            Ask the user if they will be
traveling in the next year (String - yes or no)
                > If yes: add 100 to
the cost
                > If no: subtract 50
from the cost
Print: "Looks like your password has
been expired for $years, but not to worry we will get it ready for you to
travel to $allCountries. Your total cost has come out to $costAmount."
 */