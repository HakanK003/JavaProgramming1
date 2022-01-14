package day38_InhercitanceOverriding.employeeTask;

public class ProductOwner extends Employee{

    public ProductOwner(String name, String companyName, int age, int id, int salary, char gender) {
        super(name, "Product Owner", companyName, age, id, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(name + " is prioritizing test cases");
    }
}
