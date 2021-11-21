package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

        int n = 100;

        if (n%2==0){
            System.out.println("Even");   // String and one statement
        }else{
            System.out.println("Odd");    // String and one statement
        }

        System.out.println("-------------------------------------------");


        String result1 = (n%2==0)? "Even" : "Odd" ;
        System.out.println(result1);


        System.out.println("-------------------------------------------");


        int age = 23;

        if (age>=21){
            System.out.println("Eligible");       // String and one statement
        }else{
            System.out.println("Not eligiblle");   // String and one statement
        }


        String result2=(age>=21)?"Eligible":"Not eligible";     //better doing like variable
        System.out.println(result2);

        //System.out.println((age>=21)?"Eligible":"Not eligible";); we can use like this to but not recommended


        System.out.println("-----------------------------------------------------------");


        int number = 100;

        if(number > 0){
            System.out.println("Positive");   // one value and same data type
        }else if(number<0){
            System.out.println("Negative");   // one value and same data type
        }else{
            System.out.println("Zero");       // one value and same data type
        }

        String result3 = (number>0)? "Positive" :(number<0)? "Negative" : "Zero";       //we have to assign like data
        System.out.println(result3);




    }
}
