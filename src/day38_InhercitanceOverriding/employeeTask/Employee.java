package day38_InhercitanceOverriding.employeeTask;

public class Employee {

    public String name, jobTitle, companyName;
    public int age, id, salary;
    public char gender;

    public Employee(String name, String jobTitle, String companyName, int age, int id, int salary, char gender) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.age = age;
        this.id = id;
        this.salary = salary;
        this.gender = gender;
    }

    public void work(){
        System.out.println();
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}

/*
Employee Task:
	1. Create a class named Employee
			Variables:
				name, age, gender, id, jobTitle, salary, companyName

			Add a constructor to set all the fields

			Methods:
				work()
				toString()


	2. Create ethe following subclasses and override the work method in each subclass:

			1. Tester
			2. Developer
			3. ProductOwner
			4. BusinessAnalyst
			5. ScrumMaster
			6. Teacher
			7. Driver
			9. Pilot

		if any additional field or methods needed, please add them
 */