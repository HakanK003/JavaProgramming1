package day39_Recap.deviceTask;

public class PersonalComputer extends Computer{

    public PersonalComputer(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void playGame(){
        System.out.println("Playing game in "+getBrand()+" "+getModel());
    }

}
