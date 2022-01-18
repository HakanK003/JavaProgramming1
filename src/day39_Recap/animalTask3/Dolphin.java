package day39_Recap.animalTask3;

public class Dolphin extends FriendlyAnimal{

    public Dolphin(String name, String size, String color, int age, char gender, boolean isPlayable) {
        super(name, "Dolphin", size, color, age, gender, isPlayable);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating dolphin food");
    }

    public void swim(){
        System.out.println(getName()+" is swimming");
    }

}
