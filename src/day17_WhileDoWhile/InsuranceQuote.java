package day16_WhileDoWhile;

import java.util.Scanner;

public class InsuranceQuote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = input.nextLine();

        char gender;
        do {System.out.println("Enter your gender (M/F)");
            gender = input.next().charAt(0);
            input.nextLine();
        }while(!(gender=='M'||gender=='F'));

        boolean isMarried=false;
        String yesNo1;
        do {System.out.println("Are you married (Yes/No)");
            yesNo1 = input.nextLine();
            if (yesNo1.equalsIgnoreCase("yes")){isMarried=true;}
            else if (yesNo1.equalsIgnoreCase("no")){isMarried=false;}
            else{System.out.println("Invalid answer please re-enter");}
        }while(!(yesNo1.equalsIgnoreCase("yes")||yesNo1.equalsIgnoreCase("no")));

        int age;
        do {System.out.println("Enter your age (0~120)");
            age = input.nextInt();
        }while(!(age>=0&&age<=120));

        int miles;
        do {System.out.println("How many miles you drive in a day (5<=)");
            miles = input.nextInt();
            input.nextLine();
        }while(!(miles>=5));

        String insuranceType;
        do {System.out.println("Full coverage or liability insurance");
            insuranceType = input.nextLine();
        }while(!(insuranceType.equalsIgnoreCase("full coverage")||insuranceType.equalsIgnoreCase("liability insurance")));

        boolean past5YearAccidents=true;
        String yesNo2;
        do {System.out.println("Did you had accidents or claims in past 5 years (Yes/No/Never)");
            yesNo2 = input.nextLine();
            if (yesNo2.equalsIgnoreCase("yes")||yesNo2.equalsIgnoreCase("never")){past5YearAccidents=true;}
            else if (yesNo2.equalsIgnoreCase("no")){past5YearAccidents=false;}
            else{System.out.println("Invalid answer please re-enter");}
        }while(!(yesNo2.equalsIgnoreCase("yes")||yesNo2.equalsIgnoreCase("no")||yesNo2.equalsIgnoreCase("never")));

        boolean antiTheft=false;
        String yesNo3;
        do {System.out.println("Have you got anti theft (Yes/No)");
            yesNo3 = input.nextLine();
            if (yesNo3.equalsIgnoreCase("yes")){antiTheft=true;}
            else if (yesNo3.equalsIgnoreCase("no")){antiTheft=false;}
            else{System.out.println("Invalid answer please re-enter");}
        }while(!(yesNo3.equalsIgnoreCase("yes")||yesNo3.equalsIgnoreCase("no")));

        input.close();

        double price=0;
        double discount=0;


        if (insuranceType.equalsIgnoreCase("full coverage")){
            if (age>=25){price+=120;}else{price+=160;}
            if (miles>50){price+=70;}else if(miles>10){price+=40;}else{price+=20;}

        }else{
            if (age>=25){price+=50;}else{price+=90;}
            if (miles>50){price+=50;}else if(miles>10){price+=30;}else{price+=10;}
        }
        if (isMarried){discount+=5;}
        if (antiTheft){discount+=5;}
        if (!(past5YearAccidents)){discount+=15;}
        if (yesNo2.equalsIgnoreCase("never")){discount+=10;}

        if (discount!=0){price=price-(price/100*discount);}

        System.out.println(price);

    }
}

/*
Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount
 */