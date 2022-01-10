package day34_GarbageCollection_AccessModifiers;

class Dog2 {

    public String breed, size, color;
    public char gender;
    public int age;

    public static int numberOfEyes, numberOfLegs, numberOfWings;
    public static boolean isFriendly;

    static {
        numberOfEyes=2;
        numberOfLegs=4;
        numberOfWings=0;
        isFriendly=true;
    }

    public Dog2(String breed, String size, String color, char gender, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }

    public void eat(){
        System.out.println("Dog is eating");
    }

    public void drink(){
        System.out.println("Dog is drinking");
    }

    public void sleep(){
        System.out.println("Dog is sleeping");
    }

    public void play(){
        System.out.println("Dog is playing");
    }

    public void bark(){
        System.out.println("Dog is barking");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", number of eye =" + numberOfEyes +
                ", number of leg =" + numberOfLegs +
                ", number of wings =" + numberOfWings +
                ", is friendly? =" + (isFriendly?"Yes it's":"No it isn't") +
                '}';
    }


}

class Dog2Object{

    public static void main(String[] args) {

        Dog2 dog1 = new Dog2("Husky", "Big", "White-Black", 'F',3);
        dog1.eat();
        dog1.drink();
        dog1.play();
        dog1.bark();
        dog1.sleep();
        System.out.println(dog1);

    }
}

/*
Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()
 */