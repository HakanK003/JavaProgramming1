package day38_InhercitanceOverriding.employeeTask;

public class Developer extends Employee{

    public Developer(String name, String companyName, int age, int id, int salary, char gender) {
        super(name, "Developer", companyName, age, id, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(name + " is coding");
    }
}
