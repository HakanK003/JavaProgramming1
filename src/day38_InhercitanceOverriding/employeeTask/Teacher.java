package day38_InhercitanceOverriding.employeeTask;

public class Teacher extends Employee{

    public Teacher(String name, String companyName, int age, int id, int salary, char gender) {
        super(name, "Teacher", companyName, age, id, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(name + " is teaching");
    }
}
