package day53_LastJavaMeals.predicateFunctionBiPredicateBiFunction;

import java.util.Properties;
import java.util.function.Predicate;

public class PasswordValidationPredicate {

    public static void main(String[] args) {

        Predicate<String> passwordValidation = x->{

            boolean rule1 = x.length()>=8,
                    rule6 = !(x.contains(" ")),
                    rule2 = false,
                    rule3 = false,
                    rule4 = false,
                    rule5 = false;


            for (int i = 0; i < x.length(); i++) {

                char ch = x.charAt(i);

                if (Character.isDigit(ch)){rule5=true;continue;}
                if (Character.isUpperCase(ch)){rule2=true;continue;}
                if (Character.isLowerCase(ch)){rule3=true;continue;}
                if (!(Character.isLetterOrDigit(ch))){rule4=true;continue;}

            }


            return rule1&&rule2&&rule3&&rule4&&rule5&&rule6;

        };


        System.out.println(passwordValidation.test("Asd1@?2Asd"));
        System.out.println(passwordValidation.test("Asd@?Asd"));
        System.out.println(passwordValidation.test("Asd12Asd"));
        System.out.println(passwordValidation.test("asd1@?2asd"));
        System.out.println(passwordValidation.test("ASD1@?2ADF"));
        System.out.println(passwordValidation.test("Asd1@"));
        System.out.println(passwordValidation.test("Asd1@ ?2Asd"));
        System.out.println(passwordValidation.test("Asd1@?2Asd"));



    }

}

/*
Use Predicate Functional interface to:
		3.1 Create a function that can verify if a strong contains duplicated characters

		3.2 Create a function that can verify if a password is a strong password. Characteristics of strong passwords are:
		        1 Password must be at least have 8 characters long, and should not contain space
		        2 PassWord should at least contain one upper case letter
		        3 PassWord should at least contain one lower case letter
		        4 Password should at least contain one special characters
		        5 Password should at least contain a digit
 */