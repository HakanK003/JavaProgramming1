package day38_InhercitanceOverriding.carTask;

public class ParkingLot {

    public static void main(String[] args) {


        Tesla tesla1 = new Tesla("model X", "black", 2020, 50000, 75000);
        Toyota toyota1 = new Toyota("Camry", "Gray", 2021, 35000, 25000);
        BMW bmw1 = new BMW("X5", "black", 2020, 67350, 12000);

        toyota1.start();
        tesla1.start();
        bmw1.start();

        tesla1.autoPilot();
        toyota1.reliable();
        bmw1.racing();
        bmw1.breakDown();

        System.out.println(toyota1);
        System.out.println(tesla1);
        System.out.println(bmw1);

    }
}