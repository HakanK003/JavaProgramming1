package day38_InhercitanceOverriding.animalTask;

public class Dog extends Animal{

    public Dog(String name, String size, String color, int age, char gender) {
        super(name, "Dog", size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats dog food");
    }
}
