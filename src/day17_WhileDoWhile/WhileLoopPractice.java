package day17_WhileDoWhile;

import java.util.Scanner;

public class WhileLoopPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //username: "Cydeo"
        //password: "Cydeo123"

        System.out.println("Enter your username");
        String username = input.nextLine();
        System.out.println("Enter your password");
        String password = input.nextLine();




           if((username.equals("Cydeo")&&password.equals("Cydeo123"))){

           }else{
               int attempt = 3;
               while(!(username.equals("Cydeo")&&password.equals("Cydeo123"))&&attempt>0){
                if(attempt==1){System.out.println("THIS IS YOUR LAST CHANCE");}
                attempt--;
                System.out.println("Invalid username or password");
                System.out.println("Enter your username");
                username = input.nextLine();
                System.out.println("Enter your password");
                password = input.nextLine();}
            }

           if ((username.equals("Cydeo")&&password.equals("Cydeo123"))){
               System.out.println("Successful");
           }else{
                System.err.println("Your account is locked please contact to costumer service");
            }

    }
}

/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched,
                the program should allow the user to have three attempts to enter correct credentials
                and if all three attempts are failed,
                then print "Your account is lucked."
 */