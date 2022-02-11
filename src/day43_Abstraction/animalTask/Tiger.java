package day43_Abstraction.animalTask;

public class Tiger extends Animal implements WildAnimal{

    public Tiger(String name, String size, String color, char gender, int age) {
        super(name, size, "Tiger", color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats deer");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" hunts deer");
    }

}
