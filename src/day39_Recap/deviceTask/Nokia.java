package day39_Recap.deviceTask;

public class Nokia extends Phone{

    public Nokia(String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Nokia", model, price, hasBattery, hasPowerButton);
    }

    public void isLegend(){
        System.out.println("Is Legend");
    }

}
