package day05_Concantenation;

public class ShippingAddress2 {
    public static void main(String[] args) {

        String name ="Hakan",                           //if we have one data type we can do like this
               buildingNumber = "3",
               streetName = "hhhahahhah dr",
               city = "Falls Church",
               state = "VA",
               zipCode = "33333";

        String address = name + "\n" + buildingNumber + " " + streetName
                + "\n" + city + ", " + state + " " + zipCode;

        //System.out.println(name + "\n" + buildingNumber + " " + streetName
        //        + "\n" + city + ", " + state + " " + zipCode);

        System.out.println(address);             //reusable

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