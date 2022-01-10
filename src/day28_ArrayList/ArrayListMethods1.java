package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();
        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);

        employees.remove(1);

        System.out.println(employees);

        employees.remove( employees.size() -1 );

        System.out.println(employees);

        boolean r1 = employees.remove("Hulya");//if we put non-Primitive it will return as boolean (true if list contains and removed)

        System.out.println(employees);

        boolean r2 = employees.remove("Neira");//if we put non-Primitive it will return as boolean (true if list contains and removed)

        System.out.println(employees);


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);



    }

}
