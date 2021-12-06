package day14_String;

import java.util.Scanner;

public class AccountNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter account number");
        String accountNo= input.nextLine();

        input.close();

        int firstCh = accountNo.charAt(0);
        int length = accountNo.length();
        String result;

        if (firstCh>=97&&firstCh<=122) {// lowercase
        if (length==7){result="Valid account";}else{result="Invalid account";}
        }
    else if(firstCh>=65&&firstCh<=90) {// uppercase
        if (length==10){result="Valid account";}else{result="Invalid account";}
        }else if(firstCh==49||firstCh==52||firstCh==length){// digits
            result="Invalid account";
        }else{
            result="Invalid account";
        }

        System.out.println(result);

    }
}

/*
Create a class called AccountNumber.
Ask the user enter an account number (String). Check if these
account number is valid.
> If the account number begins with a â2â the account
number should be 7 characters long
> If the account number begins with a â5â the account
number should be 10 characters long
â> If the account number does not begin with a 2 or a 5 OR
the account number lengths
do not meet the expected results print âInvalid
account numberâ
 */