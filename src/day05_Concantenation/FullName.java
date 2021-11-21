package day05_Concantenation;

import java.sql.SQLOutput;

public class FullName {
    public static void main(String[] args) {

        String firstName ="Hakan";
        String lastName ="Karatas";
        int age =18;
        String jobTitle ="Senior SDET";
        double salary = 100000.58;
        String companyName = "Apple inc.";
        System.out.println(firstName + " " + lastName);

        System.out.println("-------------------------------------");

        String fullName = firstName + " " + lastName;

        System.out.println("Full name of the person is " + fullName );
        System.out.println(fullName + " is " + age + " years old");

        System.out.println(fullName+" is "+jobTitle+", works at "+companyName
                +", and" +fullName+"'s salary is $"+salary);
    }

}
/*
Create a class called FullName.java
Declare the following variables:
1.firstName
2.lastName
Use concatenation to print the full address
 */