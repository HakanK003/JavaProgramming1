package day32_Constructors;

public class Item {

    public String name;
    public double price;
    public int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double calcCost(){
        double totalPrice =price*quantity;
        return  totalPrice;
    }

    public String toString() {
        return "Item{" +
                "name=' " + name + '\'' +
                ", price= " + price +
                ", quantity= " + quantity +
                ", total price= $" + calcCost() +
                '}';
    }
}

/*
 Item Task:
		4.1 Create a class called Item
            Attributes:
                name, unitPrice, quantity

            Add a constructor to initialize all the fields

            Methods:
                calcCost(): returns the total price of the Item
                toString(): returns the name, unitPrice, quantity and total Price that's calculated by calcCost()
 */