package day33_Statics;

public class PersonTest {

    public static void main(String[] args) {

        Person person1 = new Person("HK",18,'M');

        person1.eat();
        person1.drink();
        person1.sleep();

        System.out.println(person1);

    }

}
