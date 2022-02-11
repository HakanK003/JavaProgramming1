package day44_Abstraction.carTaskInterface;

public class Audi extends Car implements AutoPark{


    public Audi(String brand, String model, int year, String color, double price) {
        super(brand, model, year, color, price);
    }

    @Override
    public void autoPark() {
        System.out.println("Press button for auto parking");
    }

    @Override
    public void start() {
        System.out.println("Press the button");
    }

    @Override
    public void drive() {
        System.out.println("Drive normal");
    }
}
