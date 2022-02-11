package day43_Abstraction.carTask;

public final class Tesla extends Car{

    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, color, price, miles);
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\"");
    }

}
