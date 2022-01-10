package day34_GarbageCollection_AccessModifiers;

public class Person2 {

    public String name, language;
    public int age;
    public char gender;

    public static String planet;
    public static int numberOfWings, numberOfHead;
    public static boolean isHuman, hasNose;

    static {
        planet="Earth";
        numberOfHead=1;
        numberOfWings=0;
        isHuman=true;
        hasNose=true;
    }

    public Person2(String name, String language, int age, char gender) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.gender = gender;
    }

    public void printPlanetName(){
        System.out.println(planet);
    }

    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", planet=" + planet +
                ", is human=" + (isHuman?"Yes":"No") +
                ", has nose=" + (hasNose?"Yes":"No") +
                ", number of head=" + numberOfHead +
                ", number of wings=" + numberOfWings +
                '}';
    }
}

class Person2Object{

    public static void main(String[] args) {

        Person2 person1 = new Person2("Abc","English",18,'M');

        person1.eat("apple");
        person1.drink("water");
        person1.printPlanetName();
        System.out.println(person1);


    }

}

/*
Create a class named Person:
            Variables:
                name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            Methods:
                printPlanetName()
                eat(String food)
                drink(String drink)
                toString()
 */