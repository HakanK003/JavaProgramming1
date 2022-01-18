package day38_InhercitanceOverriding.animalTask;

public class Animal {

    public String name, breed, size, color;
    public int age;
    public char gender;


    public Animal(String name, String breed, String size, String color, int age, char gender){
        this.name=name;
        this.breed=breed;
        this.size=size;
        this.color=color;
        this.age=age;
        this.gender=gender;
    }

    public void eat(){
        System.out.println("Animal eats");
    }


    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

/*
Animal Task:
	1. Create a class named Animal:
			Variables:
				name, breed, age, gender, size, color

			Add a constructor to set all the fields

			methods:
				eat()
				toString()

	2. Create the following subclasses of Animal and override the eat method:
			1. Cat
					eat(): eats cat food

			2. Dog
					eat(): eats dog food

			3. Tiger
					eat(): eats deer

			4. Eagle
					eat(): eats snake

 */