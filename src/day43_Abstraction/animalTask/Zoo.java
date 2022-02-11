package day43_Abstraction.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Aaa", "Medium", "Black", 'F', 3);
        Dog dog1 = new Dog("Bbb", "Big", "Grey", 'M', 5);
        Eagle eagle1 = new Eagle("Ccc", "Medium", "Black", 'M', 2);
        Parrot parrot1 = new Parrot("Ddd", "Small", "Green", 'F', 2);
        Tiger tiger1 = new Tiger("Eee", "Big", "Orange", 'M', 4);

        System.out.println(cat1);
        System.out.println(dog1);
        System.out.println(eagle1);
        System.out.println(parrot1);
        System.out.println(tiger1);


    }

}
