package day39_Recap.animalTask3;

public class FriendlyAnimal extends Animal{

    private static boolean isWild, isFriendly;
    private boolean isPlayable;

    static {
        isWild=false;
        isFriendly=true;
    }

    public FriendlyAnimal(String name, String breed, String size, String color, int age, char gender, boolean isPlayable) {
        super(name, breed, size, color, age, gender);
        setPlayable(isPlayable);
    }

    public static boolean isIsWild() {
        return isWild;
    }

    public static void setIsWild(boolean isWild) {
        FriendlyAnimal.isWild = isWild;
    }

    public static boolean isIsFriendly() {
        return isFriendly;
    }

    public static void setIsFriendly(boolean isFriendly) {
        FriendlyAnimal.isFriendly = isFriendly;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }

    public void play(){
        System.out.println(getName()+" is playing");
    }

    public void pet(){
        System.out.println(getName()+" is a pet");
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
2. Create a subclass of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()

					4. Create the following subclasses of FriendlyAnimal and Override the eat method
			1. Dog:
					Extra methods:
						bark()

			2. Cat:
					Extra methods:
						scratch()
						meow()

			3. Dolphin:
					Extra methods:
						swim()

			4. Parrot:
					Extra methods:
						fly()
						sing()
 */