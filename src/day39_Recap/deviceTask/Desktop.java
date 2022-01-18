package day39_Recap.deviceTask;

public class Desktop extends Computer{

    public Desktop(String brand, String model, double price, boolean hasPowerButton) {
        super(brand, model, price, false, hasPowerButton);
    }

    public void worksGreat(){
        System.out.println(getBrand()+" "+getModel()+" is working great");
    }

}
