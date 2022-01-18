package day39_Recap.animalTask3;

public class Dog extends FriendlyAnimal{

    public Dog(String name, String size, String color, int age, char gender, boolean isPlayable) {
        super(name,"Dog", size, color, age, gender, isPlayable);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating dog food");
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }

}
