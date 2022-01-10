package day35_Encapsulation;

public class Item {

    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        char[] ch1 = name.toCharArray();
        boolean setName= !name.isEmpty() && !name.isBlank() && Character.isLetter(ch1[0]);
        if (setName){
        for (char each : ch1){
                setName= Character.isLetterOrDigit(each) || each == ' ';
               if (!setName)break;
            }}
        if (setName) setName(name); else System.err.println("Invalid Entry for name");
        if (price>0)setPrice(price); else System.err.println("Invalid Entry for price");
        if (quantity>0) {
            if (!name.equalsIgnoreCase("toilet paper")) setQuantity(quantity);
            else { if (quantity==1)setQuantity(quantity); else System.err.println("Invalid Entry for quantity"); }
        }else System.err.println("Invalid Entry for quantity");
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        char[] ch1 = name.toCharArray();
        boolean setName= !name.isEmpty() && !name.isBlank() && Character.isLetter(ch1[0]);
        for (char each : ch1){
            setName= Character.isLetterOrDigit(each) || each == ' ';
            if (!setName)break;
        }
        if (setName) this.name = name; else System.err.println("Invalid Entry for name");
    }

    public void setPrice(double price) {
        if (price>0)this.price = price; else System.err.println("Invalid Entry for price");

    }

    public void setQuantity(int quantity) {
        if (quantity>0) {
            if (!name.equalsIgnoreCase("toilet paper"))
            else { if (quantity==1) this.quantity = quantity; else System.err.println("Invalid Entry for quantity"); }
        }else System.err.println("Invalid Entry for quantity");
    }

    public double calcCost(){
        return price * quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", cost = $" + calcCost() +
                '}';
    }
}

/*
Item Task
		4.1create a class called Item
	            private variables:
	            	name, unitPrice, quantity

            	Encapsulate all the fields:
            		Conditions:
            			name can not be empty or blank
            			name can not contain any special characters other than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
            			if the Item name is toilet paper (case-insensitive) then the quantity can not be more than 1


            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()

 */