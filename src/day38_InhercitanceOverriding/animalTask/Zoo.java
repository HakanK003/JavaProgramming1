package day38_InhercitanceOverriding.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Aaa","Small","White",1,'F');
        Dog dog1 = new Dog("Bbb", "Big", "Gray", 3 ,'M');
        Tiger tiger1 = new Tiger("Ccc", "Big", "Orange and Black",5,'M');
        Eagle eagle1 = new Eagle("Ddd", "Medium","Black and White", 2,'F');

        cat1.eat();
        dog1.eat();
        tiger1.eat();
        eagle1.eat();

        System.out.println(cat1);
        System.out.println(dog1);
        System.out.println(tiger1);
        System.out.println(eagle1);


    }

}
