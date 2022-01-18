package day39_Recap.animalTask3;

public class Tiger extends WildAnimal{

    public Tiger(String name, String size, String color, int age, char gender, boolean isPlayable) {
        super(name,"Tiger", size, color, age, gender, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting deer");
    }

    public void run(){
        System.out.println(getName()+" is running");
    }

}
