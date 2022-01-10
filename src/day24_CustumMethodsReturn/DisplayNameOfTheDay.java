package day24_CustumMethodsReturn;

public class DisplayNameOfTheDay {

    public static void main(String[] args) {


        int num = 3;
        dayFinder(num);
    }

    public static void dayFinder(int num){

        switch (num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.err.println("Invalid Entry");
        }


    }
}

/*
Create a method that can print the name of the day based on the given number to the method
 */