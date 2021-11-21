package day05_Concantenation;

public class ShippingAddress {
    public static void main(String[] args) {

        String name = "Hakan";
        String buildingNumber = "3";
        String streetName = "hhhahahhah dr";
        String city = "Falls Church";
        String state = "VA";
        String zipCode = "33333";

        String address = name + "\n" + buildingNumber + " " + streetName
                + "\n" + city + ", " + state + " " + zipCode;


        //System.out.println(name + "\n" + buildingNumber + " " + streetName
        //                    + "\n" + city + ", " + state + " " + zipCode);

        System.out.println(address);            //reusable


    }
}

/*
Create a class called ShippingAddress.java
Declare the following variables:
name
buildingNumber
streetName
city
state
zipCode

Use concatenation to print the full shipping address
 */