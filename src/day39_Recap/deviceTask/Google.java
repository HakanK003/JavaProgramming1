package day39_Recap.deviceTask;

public class Google extends Phone{

    public Google(String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Google", model, price, hasBattery, hasPowerButton);
    }

    public void useGoogleAssistant(){
        System.out.println("Using Google Assistant");
    }

}
