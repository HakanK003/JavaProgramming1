package day39_Recap.deviceTask;

public class Laptop extends Computer{

    public Laptop(String brand, String model, double price, boolean hasPowerButton) {
        super(brand, model, price, true, hasPowerButton);
    }

    public void isPortable(){
        System.out.println(getBrand()+" "+getModel()+" is portable");
    }

}
