package day13_String;

import java.util.Scanner;

public class LogInFunction {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter username");
        String userName = input.nextLine();
        System.out.println("Enter password");
        String password = input.nextLine();

        input.close();

        String result = (userName.equals("Cydeo")&&password.equals("WoodenSpoon"))?
                        "Logged in" : "Incorrect username or password";

        System.out.println(result);

    }
}

/*
You are writing a code for the log-in function of the Cybertek
Application, assume that your credentials are:
username: Cydeo
password: WoodenSpoon
Ask the user to enter their credentials. If credentials are
matched, your program should print "Logged in."
otherwise print "Incorrect username or password" as error message
Hints: In order to login, both username and password MUST
be correct
you will need to use equals() methodAsk the user to enter their credentials. If credentials are
matched, your program should print "Logged in."
otherwise print "Incorrect username or password" as error message
Hints: In order to login, both username and password MUST
be correct
 */