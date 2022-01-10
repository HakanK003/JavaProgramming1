package day30_CustomClasses;

import java.util.ArrayList;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Aygun",'F',39,2210,'A');

        Student student2 = new Student();
        student1.setInfo("Hulya",'F',26,2123,'B');

        Student student3 = new Student();
        student1.setInfo("Elminur",'F',26,2215,'A');

        Student student4 = new Student();
        student1.setInfo("Ali",'F',28,5511,'B');

        Student student5 = new Student();
        student1.setInfo("Mert",'F',26,2252,'C');

        Student[] students = {student1,student2,student3,student4,student5};

        for (Student student : students){
            System.out.println(student);
        }

        System.out.println("-----------------------------------------------");

        ArrayList<Student> earlyBird = new ArrayList<>(); //grade A
        ArrayList<Student> angryBird = new ArrayList<>();

        for (Student student : students) {
            if (student.grade=='A'){earlyBird.add(student);}
            else{angryBird.add(student);}
        }



    }

}
