package day33_Statics;

public class CydeoStudent2Test {

    public static void main(String[] args) {

        CydeoStudent2 student1 = new CydeoStudent2("HK",18,333,25,30,'M','B');

        System.out.println(student1);
        student1.study();
        student1.attendClass();
        student1.printProgramingLanguage();
        student1.printSchoolName();

    }

}
