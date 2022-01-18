package day39_Recap.animalTask3;

public class Cat extends FriendlyAnimal{

    public Cat(String name, String size, String color, int age, char gender, boolean isPlayable) {
        super(name,"Cat", size, color, age, gender, isPlayable);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating cat food");
    }

    public void meow(){
        System.out.println(getName()+" is meowing");
    }

    public void scratch(){
        System.out.println(getName()+" is scratching");
    }

}
