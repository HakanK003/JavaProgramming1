package day19_LoopPracticesAndExit;

import java.util.Scanner;

public class SalaryCalculatorLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        boolean wantRepeat= true;

        do {
            System.out.println("How much you make an hour?");
            int hourlyRate = input.nextInt();
            if (hourlyRate <= 0) {
                System.err.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }

            System.out.println("How many hours do you work per week?");
            int hourPerWeek = input.nextInt();
            if (hourPerWeek > 144 || hourPerWeek < 1) {
                System.err.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }

            System.out.println("Enter your state tax rate");
            double taxRate = input.nextDouble();
            if (taxRate > 10 || taxRate < 0) {
                System.err.println("Invalid Entry for state tax Rate");
                System.exit(0);
            }

            double grossSalary = hourlyRate * hourPerWeek * 52;
            double federalTax = grossSalary / 100 * 26;
            double stateTax = grossSalary / 100 * taxRate;
            double totalTax = federalTax + stateTax;
            double salaryAfterTax = grossSalary - totalTax;

            System.out.println("Gross Salary = " + grossSalary + "\nFederal Tax = " + federalTax + "\nState Tax = " + stateTax +
                    "\nTotal Tax = " + totalTax + "\nSalary After Tax = " + salaryAfterTax);

            System.out.println("Would you like to continue?");
            String yesNo = input.next();



            if (yesNo.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                wantRepeat=false;
            } else if (yesNo.equalsIgnoreCase("yes")){continue;}
            else{
                System.err.println("Invalid answer");System.exit(0);}

        }while(wantRepeat);


    }
}

/*
 Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative,
					terminate the program after displaying the error message
					"Invalid Entry for Hourly Rate"

			2. Ask the user  "How many hours do you work per week?"
					if user entered weeklyHour is less than 1 or greater than 144,
					terminate the program after displaying the error message
					"Invalid Entry for Weekly Hours"

			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%,
					terminate the program after displaying the error message
					"Invalid Entry for state tax Rate"


			4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income

			5. Ask the user "Would you like to continue?"
				If "yes" --> repeat all the previous steps
				If "no" --> print "Thank you for using Cydeo Salary Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"

 */