package day39_Recap.animalTask3;

public class Bear extends WildAnimal{

    public Bear(String name, String size, String color, int age, char gender, boolean isPlayable) {
        super(name, "Bear", size, color, age, gender, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting fish");
    }

    public void walk(){
        System.out.println(getName()+" is walking");
    }

}
