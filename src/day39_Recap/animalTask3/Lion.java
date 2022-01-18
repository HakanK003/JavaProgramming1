package day39_Recap.animalTask3;

public class Lion extends WildAnimal{

    public Lion(String name, String size, String color, int age, char gender, boolean isPlayable) {
        super(name, "Lion", size, color, age, gender, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting deer");
    }

    public void roar(){
        System.out.println(getName()+" is roaring");
    }

}
