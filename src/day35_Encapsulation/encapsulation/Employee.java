package day35_Encapsulation.encapsulation;

public class Employee {

    private String name;
    private char gender;
    private int age;
    private int salary;

    public Employee(String name, char gender, int age, int salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (!name.isEmpty()){this.name = name;}else {System.err.println("Invalid name "+name);}
    }

    public void setGender(char gender) {
        if (gender=='M'||gender=='F') {this.gender = gender;} else {System.err.println("Invalid gender "+gender);}
    }

    public void setAge(int age) {
        if (age>16&&age<90) {this.age = age;} else System.err.println("Invalid age "+age);
    }

    public void setSalary(int salary) {
        if (salary>0) {this.salary = salary;} else {System.err.println("Invalid salary "+salary);}
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

}

/*
 Create an Employee Class:
            private variables:
                name, gender, age, salary

            Encapsulate all the private fields

                1. Name can not be empty
                2. gender can not anything other than female or male
                3. age can not be zero , negative or greater than 150
                4. salary can not be zero or negative
 */