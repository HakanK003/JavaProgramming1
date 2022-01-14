package day38_InhercitanceOverriding.employeeTask;

public class Driver extends Employee{

    public Driver(String name, String companyName, int age, int id, int salary, char gender) {
        super(name, "Driver", companyName, age, id, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(name + " is driving");
    }
}
