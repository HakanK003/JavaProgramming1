package day39_Recap.animalTask3;

public class WildAnimal extends Animal{

    private static boolean isWild, isFriendly;
    private boolean isPlayable;

    static {
        isWild=true;
        isFriendly=false;
    }

    public WildAnimal(String name, String breed, String size, String color, int age, char gender, boolean isPlayable) {
        super(name, breed, size, color, age, gender);
        setPlayable(isPlayable);
    }

    public static boolean isIsWild() {
        return isWild;
    }

    public static void setIsWild(boolean isWild) {
        WildAnimal.isWild = isWild;
    }

    public static boolean isIsFriendly() {
        return isFriendly;
    }

    public static void setIsFriendly(boolean isFriendly) {
        WildAnimal.isFriendly = isFriendly;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }

    public void hunt(){
        System.out.println(getName()+" is hunting");
    }

    @Override
    public String toString() {
        return "FriendlyAnimal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", is Friendly=" + (isFriendly?"Yes":"No") +
                ", is Wild =" + (isWild?"Yes":"No") +
                ", is Playable=" + (isPlayable?"Yes":"No") +
                '}';
    }

}

/*
3. Create a subclass of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()

			5. Create the following subclasses of WildAnimal and Override the hunt method, and add any extra methods that are needed:
				1. Lion
				2. Tiger
				3. Eagle
				4. Bear
				5. Python
				6. Crocodile

 */