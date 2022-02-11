package day44_Abstraction.carTaskInterface;

public class Honda extends Car{

    public Honda(String brand, String model, int year, String color, double price) {
        super(brand, model, year, color, price);
    }

    @Override
    public void start() {
        System.out.println("Twist the key");
    }

    @Override
    public void drive() {
        System.out.println("Drive normal");
    }
}
