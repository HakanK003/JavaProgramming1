package day12_Scanner;

import java.util.Scanner;

public class SpeedCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter speed limit");
        int limitSpeed= input.nextInt();

        System.out.println("Enter your current speed");
        int currentSpeed = input.nextInt();

        input.close();

        if (currentSpeed>limitSpeed){
            System.out.println("You're driving "+(currentSpeed-limitSpeed)+" mph over the limit. Slow down!");}

    }
}
