package day38_InhercitanceOverriding.employeeTask;

public class Pilot extends Employee{

    public Pilot(String name, String companyName, int age, int id, int salary, char gender) {
        super(name, "Pilot", companyName, age, id, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(name + " is flying");
    }
}
