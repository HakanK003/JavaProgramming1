package day39_Recap.animalTask3;

public class Crocodile extends WildAnimal{

    public Crocodile(String name, String size, String color, int age, char gender, boolean isPlayable) {
        super(name,"Crocodile", size, color, age, gender, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting ducks");
    }

    public void swim(){
        System.out.println(getName()+" is swimming");
    }

}
