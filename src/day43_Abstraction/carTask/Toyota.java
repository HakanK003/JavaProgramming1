package day43_Abstraction.carTask;

public final class Toyota extends Car{

    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, color, price, miles);
    }

    @Override
    public void start() {
        System.out.println("Twist the key to ignition");
    }

}
