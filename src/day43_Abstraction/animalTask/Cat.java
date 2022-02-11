package day43_Abstraction.animalTask;

public class Cat extends Animal implements Playable{

    public Cat(String name, String size, String color, char gender, int age) {
        super(name, size, "Cat", color, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats Biryani");
    }



    @Override
    public void play() {

    }

}
