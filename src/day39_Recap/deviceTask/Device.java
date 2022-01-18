package day39_Recap.deviceTask;

public class Device {

    private String brand, model;
    private double price;
    private boolean hasBattery, hasPowerButton;

    public Device(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
       setBrand(brand);
       setModel(model);
       setPrice(price);
       setHasBattery(hasBattery);
       setHasPowerButton(hasPowerButton);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.equals("null")||brand.isBlank()||brand.isEmpty()){
            System.err.println("Invalid entry "+ brand);
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.equals("null")||model.isBlank()||model.isEmpty()){
        System.err.println("Invalid entry "+ model);
        System.exit(1);
    }
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            System.err.println("Invalid entry "+ price);
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public void turnOn(){
        System.out.println("Device "+brand+" "+model+" is turned on");
    }

    public void turnOff(){
        System.out.println("Device "+brand+" "+model+" is turned off");
    }

    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}

/*
1. Create a class named Device:
			Variables:
					brand, model, price, hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model can not be null (if obj == null means it's error)
							2. brand, model can not be empty or can not be blank
							3. price can not be set to negative or zero

			Methods:
				turnOn(), turnOff(), toString()

 */