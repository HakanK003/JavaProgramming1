package day33_Statics;

public class CydeoStudent2 {

    public String name;
    public int age, id, batchNumber, groupNumber;
    public char gender, grade;

    public static String schoolName="Cydeo", programmingLanguage="Java";

    public CydeoStudent2(String name, int age, int id, int batchNumber, int groupNumber, char gender, char grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
        this.grade = grade;
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    public void attendClass(){
        System.out.println(name + " is attending class");
    }

    public void printSchoolName(){
        System.out.println("School name = "+ schoolName);
    }

    public void printProgramingLanguage(){
        System.out.println("Programming Language = "+ programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}

/*
CydeoStudent2 Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()

 */