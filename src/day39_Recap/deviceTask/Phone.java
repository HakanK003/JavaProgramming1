package day39_Recap.deviceTask;

public class Phone extends Device{

    public Phone(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void call(long number){
        System.out.println("Calling "+number);
    }

    public void text(long number){
        System.out.println("Texting "+number);
    }

}

/*
2. Create a subclass of Device named Phone:

				Extra Methods:
						call(long phoneNum), text(long phoneNum)

 */