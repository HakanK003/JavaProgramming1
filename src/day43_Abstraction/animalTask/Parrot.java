package day43_Abstraction.animalTask;

public class Parrot extends Animal implements Playable, Flyable{

    public Parrot(String name, String size, String color, char gender, int age) {
        super(name, size, "Parrot", color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats chocolate");
    }


    @Override
    public void fly() {
        System.out.println("Can fly");
    }

    @Override
    public void play() {

    }

}
