package day38_InhercitanceOverriding.animalTask;

public class Cat extends Animal{

    public Cat(String name, String size, String color, int age, char gender) {
        super(name, "Cat", size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats cat food");
    }

}
