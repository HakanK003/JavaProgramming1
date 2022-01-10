package day33_Statics;

public class Dog {

    public String breed, size, color;
    public char gender;
    public int age;

    public static int numberOfEyes=2, numberOfLegs=4, numberOfWings=0;
    public static boolean isFriendly=true;

    public Dog(String breed, String size, String color, char gender, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }

    public void eat(){
        System.out.println("Dog is eating");
    }

    public void sleep(){
        System.out.println("Dog is sleeping");
    }

    public void play(){
        System.out.println("Dog is playing");
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

/*
 Dog Task:
		1. Create a class called Dog
	            Attributes:
	            	instance: breed, size, gender, age, color
	            	statics: numberOfLegs, numberOfEyes, numberOfWings, isFriendly

	            Add a constructor to initialized all the fields (instances)

	            Methods:
	            	eat()
	            	sleep()
	            	play()
	                toString()
 */