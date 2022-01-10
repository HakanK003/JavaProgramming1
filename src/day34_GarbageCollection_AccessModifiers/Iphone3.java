package day34_GarbageCollection_AccessModifiers;

public class Iphone3 {

    public String model, size, color;
    public double price;

    public static String brand, OS, madeIn, designedIn;
    public static boolean isSmartPhone;

    static {
        brand="Apple";
        OS="IOS";
        madeIn="China";
        designedIn="USA";
        isSmartPhone=true;
    }

    public Iphone3(String model, String size, String color, double price) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public void printOperatingSystem(){
        System.out.println("Operating System is " + OS);
    }

    public void call(long phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("Texting "+phoneNumber);
    }

    public void faceTime(long phoneNumber){
        System.out.println("Face time calling "+phoneNumber);
    }

    public void faceTime(String email){
        System.out.println("Face time calling "+email);
    }

    public String toString() {
        return "Iphone3{" +
                "model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", brand=" + brand +
                ", OS =" + OS +
                ", is Smart phone =" + (isSmartPhone?"Yes":"No") +
                ", made in =" + madeIn +
                ", designed in =" + designedIn +
                '}';
    }
}

class IphoneObject{

    public static void main(String[] args) {

        Iphone3 iphone1 = new Iphone3("13 pro", "Big", "Black", 899.99);

        iphone1.call(123456789);
        iphone1.text(123456789);
        iphone1.faceTime(123456789);
        iphone1.faceTime("abc123@gmail.com");
        iphone1.printOperatingSystem();

        System.out.println(iphone1);

    }

        }

/*
Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()

 */