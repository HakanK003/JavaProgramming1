package day32_Constructors;

public class Address {

    public int buildingNumber,zipCode;
    public String street, city, state;

    public Address(String street,String city, String state, int buildingNumber, int zipCode){
        this.street=street;
        this.city=city;
        this.state=state;
        this.buildingNumber=buildingNumber;
        this.zipCode=zipCode;
    }

    public String toString() {
        return
                buildingNumber +" "+ street +
                "\n"+city  +" "+ state  +", "+  zipCode
                ;
    }
}

/*
Create a class named Address
		    Attributes:
		         buildingNumber, street, city, state, zipCode;

		   	Add a constructor to set all the fields

		    Actions
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012
 */