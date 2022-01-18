package day39_Recap.deviceTask;

public class Iphone extends Phone{

    public Iphone(String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Apple", model, price, hasBattery, hasPowerButton);
    }

    public void useSiri(){
        System.out.println("Using Siri");
    }

}
