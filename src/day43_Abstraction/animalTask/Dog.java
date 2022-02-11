package day43_Abstraction.animalTask;

public class Dog extends Animal implements Playable{

    public Dog(String name, String size, String color, char gender, int age) {
        super(name, size, "Dog", color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats Pizza");
    }



    @Override
    public void play() {

    }

}
