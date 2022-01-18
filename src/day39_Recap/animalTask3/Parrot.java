package day39_Recap.animalTask3;

public class Parrot extends FriendlyAnimal{

    public Parrot(String name, String size, String color, int age, char gender, boolean isPlayable) {
        super(name, "Parrot", size, color, age, gender, isPlayable);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating parrot food");
    }

    public void fly(){
        System.out.println(getName()+" is flying");
    }

    public void sing(){
        System.out.println(getName()+" is singing");
    }

}
