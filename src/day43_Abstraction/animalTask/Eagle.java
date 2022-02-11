package day43_Abstraction.animalTask;

public class Eagle extends Animal implements WildAnimal, Flyable {

    public Eagle(String name, String size, String color, char gender, int age) {
        super(name, size, "Eagle", color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats snake");
    }

    @Override
    public void fly() {
        System.out.println("CAn fly very good");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" hunts snakes");
    }

}
