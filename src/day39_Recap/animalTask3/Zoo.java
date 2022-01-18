package day39_Recap.animalTask3;

import java.awt.*;

public class Zoo {

    public static void main(String[] args) {

        Bear bear = new Bear("Aaa","Big","Brown",10,'M',false);
        Cat cat= new Cat("Bbb", "Medium", "Gray",6,'F',true);
        Crocodile crocodile = new Crocodile("Ccc","Big","Green",2,'M',false);
        Dog dog = new Dog("Ddd","Medium","Black",2,'M',true);
        Dolphin dolphin = new Dolphin("Eee","Big","Gray",4,'M',false);
        Eagle eagle = new Eagle("Fff","Medium","Black and White",3,'F',false);
        Lion lion = new Lion("Ggg","Big","Orange",8,'M',false);
        Parrot parrot = new Parrot("Hhh","Small","Green ang Yellow",3,'F',true);
        Python python = new Python("Jjj","Small","Green nd Black",9,'F',false);
        Tiger tiger =new Tiger("Kkk","Big","Orange and Black",7,'F',false);

        System.out.println(bear);
        System.out.println(cat);
        System.out.println(crocodile);
        System.out.println(dog);
        System.out.println(dolphin);
        System.out.println(eagle);
        System.out.println(lion);
        System.out.println(parrot);
        System.out.println(python);
        System.out.println(tiger);

        bear.hunt();
        bear.walk();

        cat.eat();
        cat.meow();
        cat.scratch();

        crocodile.hunt();
        crocodile.swim();

        dog.bark();
        dog.eat();

        dolphin.eat();
        dolphin.swim();

        eagle.fly();
        eagle.hunt();

        lion.roar();
        lion.hunt();

        parrot.eat();
        parrot.sing();
        parrot.fly();

        python.snakes();
        python.hunt();

        tiger.run();
        tiger.hunt();



    }

}

/*
6. Create a class named Zoo:
			Create the objects of each subclass and

			test all the functions of each objects

            Analyze the relationships between the classes

 */