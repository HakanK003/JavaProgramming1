package day23_CustomMethod;

public class CustomMethodWithParameter {

    public static void main(String[] args) {

        oddOrEven(5); // method demands additional info to complete its task
        ageOfPerson(2003);

    }

    public static  void oddOrEven(int number){
        if (number%2==0) {
            System.out.println(number + " is even");
        } else {
                System.out.println(number + " is odd");
            }
    }
    public static void ageOfPerson(int birthYear){
        int age = 2021-birthYear;  System.out.println("Your age is " + age);}
}
