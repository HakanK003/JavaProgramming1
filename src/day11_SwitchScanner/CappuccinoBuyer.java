package day11_SwitchScanner;

import java.util.Scanner;

public class CappuccinoBuyer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter size (tall/grande/venti)");
        String size = input.next();

        input.close();

        String result;
/*
        String result =  (size.equals("tall")?     "price is $3.69\n90 calories"
                        :(size.equals("grande")?  "price is $3.99\n120 calories"
                        :(size.equals("venti")?   "price is $4.29\n150 calories" : "Invalid Size";

                        //wtf
*/
/*
             if(size=="tall")  {result="price is $3.69\n90 calories";}
        else if(size=="grande") {result="price is $3.99\nn120 calories";}
        else if(size=="venti")  {result="price is $4.29\nn150 calories";}
        else                    {result="Invalid Size";}
*/

        switch (size){
            case "tall":
                result="price is $3.69\n90 calories";
                break;

            case "grande":
                result="price is $3.99\nn120 calories";
                break;

            case "venti":
                result="price is $4.29\nn150 calories";
                break;

            default:
                result="Invalid Size";
                break;

        }

        System.out.println(result);

    }
}
