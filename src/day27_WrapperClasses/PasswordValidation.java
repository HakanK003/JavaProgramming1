package day27_WrapperClasses;

import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a password");
        String password = input.nextLine();
        input.close();

        boolean must1_8Char        =false,
                must2_NoSpace      =false,
                must3_UpperCase    =false,
                must4_LowerCase    =false,
                must5_Digit        =false,
                must6_SpecialChar  =false;

        if (password.length()>=8){must1_8Char=true;}
        else{ System.out.println("Password MUST be at least have 8 characters long"); }

        if (!password.contains(" ")){must2_NoSpace=true;}
        else{ System.out.println("Password should not contain space"); }

        for (char each : password.toCharArray()){
            if      (Character.isUpperCase(each)) {must3_UpperCase   = true;}
            else if (Character.isLowerCase(each)) {must4_LowerCase   = true;}
            else if (Character.isDigit(each))     {must5_Digit       = true;}
            else                                  {must6_SpecialChar = true;}
        }

        if (!must3_UpperCase)   { System.out.println("Password should at least contain one upper case letter"); }
        if (!must4_LowerCase)   { System.out.println("Password should at least contain one lower case letter"); }
        if (!must5_Digit)       { System.out.println("Password should at least contain a digit"); }
        if (!must6_SpecialChar) { System.out.println("Password should at least contain one special characters"); }

        if (must1_8Char&&must2_NoSpace&&must3_UpperCase&&must4_LowerCase&&must5_Digit&&must6_SpecialChar)
        {System.out.println("Password is strong");} else {System.out.println("Please try another password");}

    }

}

/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
 */