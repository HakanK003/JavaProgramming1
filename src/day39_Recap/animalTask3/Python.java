package day39_Recap.animalTask3;

public class Python extends WildAnimal{

    public Python(String name, String size, String color, int age, char gender, boolean isPlayable) {
        super(name, "Python", size, color, age, gender, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting birds");
    }

    public void snakes(){
        System.out.println(getName()+" is snaking");
    }

}
