package day44_Abstraction.carTaskInterface;

public class Mercedes extends Car implements AutoPark{


    public Mercedes(String brand, String model, int year, String color, double price) {
        super(brand, model, year, color, price);
    }

    @Override
    public void autoPark() {
        System.out.println("Push the button for auto parking");
    }

    @Override
    public void start() {
        System.out.println("Push the button for start");
    }

    @Override
    public void drive() {
        System.out.println("Drive normal");
    }
}
