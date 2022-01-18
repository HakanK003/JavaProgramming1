package day39_Recap.deviceTask;

public class TV extends Device{

    public TV(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void channelUp(){
        System.out.println("Device "+ getBrand()+" "+getModel()+" channel up");
    }

    public void channelDown(){
        System.out.println("Device "+getBrand()+" "+getModel()+" channel down");
    }

}
