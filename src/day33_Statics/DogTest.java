package day33_Statics;

public class DogTest {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Husky","Big","White-Black",'F',3);

        dog1.eat();
        dog1.sleep();
        dog1.sleep();

        System.out.println(dog1);

    }

}
