package day44_Abstraction.carTaskInterface;

public abstract class Car {

    private final String brand, model;
    private String color;
    private final int year;
    private double price;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price<=0){throw new RuntimeException("Invalid price: "+price);}

        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String brand, String model, int year, String color, double price) {
        this.brand = brand;
        this.model = model;

        if(year < 1886){
            throw new RuntimeException("Invalid Year: "+year);
        }

        this.year = year;
        setColor(color);
        setPrice(price);
    }

    public void stop(){
        System.out.println("Press the break");
    };

    public abstract void start();

    public  abstract  void drive();

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

}
