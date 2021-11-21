package day11_SwitchScanner;

//import java.util.Scanner;

public class Browser {

    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);

        //System.out.println("Enter browser name");
        //String browserName= input.nextLine();
        String browserName = "chrome";

        boolean validBrowser = browserName=="Chrome" || browserName=="Firefox"||browserName=="Safari"
                             ||browserName=="Opera"||browserName=="Edge"||browserName=="chrome"
                             ||browserName=="firefox"||browserName=="safari"||browserName=="opera"
                             ||browserName=="edge";
        String result="";
        if (validBrowser){
           // if (browserName=="Chrome"||(browserName=="chrome"){result="Chrome browser is selected"}else
        }


    }
}

/*
 Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if

 */