package day44_Abstraction.carTaskInterface;

public class Toyota extends Car{

    public Toyota(String brand, String model, int year, String color, double price) {
        super(brand, model, year, color, price);
    }

    @Override
    public void start() {
        System.out.println("Twist the key");
    }

    @Override
    public void drive() {
        System.out.println("Normal drive");
    }
}
