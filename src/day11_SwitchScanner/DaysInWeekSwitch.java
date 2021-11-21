package day11_SwitchScanner;

public class DaysInWeekSwitch {

    public static void main(String[] args) {
        /*
         long number = 9l;
           float number = 9f;
           double number = 9d;
        boolean number = true;
   */

        int number  = 3;

        switch (number){       //if we compare like == we can use switch statement (for seeing if it's equal or not)
                               //not for other comparatives < > >= <=
                               //switch is faster then if statement
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break; // it exits the switch after executing the case block (if not exit it continu to other cases)

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
                System.out.println("Invalid Number");
                break;      //if default is in the end isn't mandatory to have break statement
                            //we can put default in everywhere

                            //nothing is mandatory but can happen bad things when we don't use break and default at end



        }
    }
}

/*

if(number==1){
       System.out.println("Monday")
}
...

 */