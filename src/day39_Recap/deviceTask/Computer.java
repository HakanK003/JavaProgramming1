package day39_Recap.deviceTask;

public class Computer extends Device{

    public Computer(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void research(){
        System.out.println("Researching with "+getBrand()+" "+getModel());
    }

}
