package day35_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("HK",'M',18,100000);

        employee1.setName("");
        employee1.setGender('9');
        employee1.setAge(-59514);
        employee1.setSalary(0);

        System.out.println(employee1);

    }

}
