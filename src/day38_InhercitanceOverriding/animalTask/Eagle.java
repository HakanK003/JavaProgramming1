package day38_InhercitanceOverriding.animalTask;

public class Eagle extends Animal{

    public Eagle(String name, String size, String color, int age, char gender) {
        super(name, "Eagle", size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats snake");
    }
}
