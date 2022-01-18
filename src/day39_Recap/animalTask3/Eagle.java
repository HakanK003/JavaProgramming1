package day39_Recap.animalTask3;

public class Eagle extends WildAnimal{

    public Eagle(String name, String size, String color, int age, char gender, boolean isPlayable) {
        super(name, "Eagle", size, color, age, gender, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting snakes");
    }

    public void fly(){
        System.out.println(getName()+" is flying");
    }

}
