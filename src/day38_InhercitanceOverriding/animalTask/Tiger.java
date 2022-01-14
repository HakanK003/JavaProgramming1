package day38_InhercitanceOverriding.animalTask;

public class Tiger extends Animal{

    public Tiger(String name, String size, String color, int age, char gender) {
        super(name, "Tiger", size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats deer");
    }
}
