package TasksNovember11;

import java.util.Scanner;

public class ChooseLanguage {
                                                    //HK003
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Choose a language\n1=English\n2=Spanish\n3=Turkish\n4=Russian\n5=French");
        int number = input.nextInt();

        if (number==1){
            System.out.println("Hello, thank for your call");
        }else  if (number==2){
            System.out.println("Hola, gracias para llamar");
        }else  if (number==3){
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        }else  if (number==4){
            System.out.println("Privet, spasibo za vash zvonok");
        }else if(number == 5){
            System.out.println("Merci ,pour votre appel");
        }else{
            System.out.println("Invalid number");
        }


    }
}

/*

Creata a class called ChooseLanguage, Given an integer variable named selection that has a number between 1~5,
Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel

 */