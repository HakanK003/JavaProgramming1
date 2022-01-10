package day24_CustumMethodsReturn;

public class DisplayHowManyDayHasAMonth {

    public static void main(String[] args) {

        String monthName ="August";
        monthDayFinder(monthName.toLowerCase());

    }

    public static void monthDayFinder(String month){

        switch (month){

            case"february":
                System.out.println("Has 28 or 29 days");
                break;
            case"january":
            case"march":
            case"may":
            case"july":
            case"august":
            case"october":
            case"december":
                System.out.println("Has 31 days");
                break;
            case"april":
            case"june":
            case"september":
            case"november":
                System.out.println("Has 30 days");
                break;
            default:
                System.err.println("Invalid Entry");

        }

    }
}

/*
Create a method that can print how many days a month has
 */