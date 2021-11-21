package TasksNovember11;

import java.util.Scanner;

public class CharacterIdentity {
                                                    //HK003
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter character");
        char character= input.next().charAt(0);

        if (character>=48&&character<=57){     //works with '1'to'9'
            System.out.println("Is a digit");
        }else if((character>=65&&character<=90)||(character>=97&&character<=122)){    //works with 'A'to'Z'||'a'to'z'
            System.out.println("Is an Alphabetic Character");
        }else{
            System.out.println("Is a Special Character");
        }








    }

}

/*

Create a class called Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table



 */