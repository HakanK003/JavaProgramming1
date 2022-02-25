package day43_Abstraction.carTask;

import java.util.ArrayList;

public class CarShop {

    public static void main(String[] args) {

        Toyota car1 = new Toyota("Highlander", 2010, 25000, "White", 255000);

        Car car2 = new Toyota("Corolla", 2011, 20000, "White", 310000);

        Car car3 = new Tesla("Model Y", 2017, 65000, "Black", 135000);

        ArrayList<Car> carList = new ArrayList<>();

        carList.add(car2);
        carList.add(car3);

        System.out.println(carList);


        //Toyota honda1 = new Toyota("Accord", 2019, "Black", 30000);

        //BMW audi1 = new BMW("Q7", 2020, "Blue", 45000);

        //Tesla tesla1 = new Tesla("Model3", 2021, "White", 60000);

        //System.out.println(honda1);
        //System.out.println(audi1);
        //System.out.println(tesla1);

        System.out.println("------------------------------------------------------------------");

        //honda1.setColor("Red");
        //audi1.setColor("Pink");
        //tesla1.setColor("Green");

        //honda1.setPrice(25000);
        //audi1.setPrice(40000);
        //tesla1.setPrice(55000);
        
        //System.out.println(honda1);
        //System.out.println(audi1);
        //System.out.println(tesla1);




    }

}
