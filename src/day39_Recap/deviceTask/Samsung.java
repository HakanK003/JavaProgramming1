package day39_Recap.deviceTask;

public class Samsung extends Phone{

    public Samsung(String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Samsung", model, price, hasBattery, hasPowerButton);
    }

    public void useBixby(){
        System.out.println("Using Bixby");
    }

}
