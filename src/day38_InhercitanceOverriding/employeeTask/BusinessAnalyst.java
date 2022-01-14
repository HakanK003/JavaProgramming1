package day38_InhercitanceOverriding.employeeTask;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, String companyName, int age, int id, int salary, char gender) {
        super(name, "Business Analyst", companyName, age, id, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(name + " analysing business");
    }
}
