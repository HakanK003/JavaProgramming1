package day39_Recap.deviceTask;

public class BlackBerry extends Phone{

    public BlackBerry(String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("BlackBerry", model, price, hasBattery, hasPowerButton);
    }

    public void isOld(){
        System.out.println("Device is old");
    }

}
