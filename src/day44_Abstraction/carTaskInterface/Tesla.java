package day44_Abstraction.carTaskInterface;

public class Tesla extends Car implements AutoPilot{

    public Tesla(String brand, String model, int year, String color, double price) {
        super(brand, model, year, color, price);
    }

    @Override
    public void autoPark() {
        System.out.println("Press button for auto parking");
    }

    @Override
    public void selfDrive() {
        System.out.println("Press button for self drive");
    }

    @Override
    public void start() {
        System.out.println("Say Start to start");
    }

    @Override
    public void drive() {
        System.out.println("You can drive normally and it has a self drive mode too");
    }
}
