package day33_Statics;

public class Iphone2 {

    public String model, color, size;
    public double price;

    public static String brand="Apple", OS="IOS" , madeIn="China";

    public Iphone2(String model, String color, String size, double price) {
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public void faceTime(){
        System.out.println("Can use facetime");
    }

    public void call(){
        System.out.println("Can call someone");
    }

    public void text(){
        System.out.println("Can text someone");
    }

    public String toString() {
        return "Iphone2{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", brand=" + brand +
                ", OS=" + OS +
                ", made in =" + madeIn +
                '}';
    }
}

/*
IPhone Task:
		1. Create a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

 */