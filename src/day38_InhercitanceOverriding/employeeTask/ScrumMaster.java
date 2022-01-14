package day38_InhercitanceOverriding.employeeTask;

public class ScrumMaster extends Employee{

    public ScrumMaster(String name, String companyName, int age, int id, int salary, char gender) {
        super(name, "Scrum Master", companyName, age, id, salary, gender);
    }

    @Override
    public void work(){
        System.out.println(name + " is helping scrum team");
    }

}
