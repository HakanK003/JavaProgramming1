package day43_Abstraction.animalTask;

public abstract class Animal {

    private String name, size;
    private final String breed, color;
    private final char gender;
    private int age;

    public Animal(String name, String size, String breed, String color, char gender, int age) {
        setName(name);
        setSize(size);
        this.breed = breed;
        this.color = color;
        this.gender = gender;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();

    public void drink(){
        System.out.println(name+" drinks water");
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" + //after calling this we have class name when we call in other class cat for cat dog for dog ecc. not always animal
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

}
