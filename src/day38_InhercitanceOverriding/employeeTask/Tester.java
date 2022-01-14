package day38_InhercitanceOverriding.employeeTask;

public class Tester extends Employee{

    public Tester(String name, String companyName, int age, int id, int salary, char gender) {
        super(name, "Tester", companyName, age, id, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(name + " is testing");
    }
}
