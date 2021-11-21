package day04_Variables;

import java.util.concurrent.Callable;

public class EmployeeInfo {

    public static void main(String[] args) {

        String name = "Hakan";
        int age = 18;
        char gender = 'M' ;             // don't forget adding '' for char
        String company = "Hmm";        // don't forget adding "" for String
        String jobTitle = "Hmm";
        double yearsOfExperience= 3.3;
        int salary= 300000;
        boolean isFullTime= true;
        boolean isMarried= false;
        String employeeId = "H333";
        String ssn ="(123)-45-6789";

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("company = " + company);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isMarried = " + isMarried);
        System.out.println("employeeId = " + employeeId);
        System.out.println("ssn = " + ssn);

    }
}
 /*
  Create a class named EmployeeInfo. declare the following variables:
                1. name (String)
                2. age (int)
                3. gender (char)
                4. company (String)
                5. jobTitle (String)
                6. yearsOfExperience (double)
                7. salary (int)
                8. isFullTime (boolean)
                9. isMarried (boolean)
                10. employeeId (String)
                11. SSN (String)
  */