package day40_FinalKeyword;

public final class Dog extends Animal{

    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating dog food");
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }

    //final method can't override
    //if a class is final we can't extend from final class
    //we can overload final methods
    //we can overload all methods

}
