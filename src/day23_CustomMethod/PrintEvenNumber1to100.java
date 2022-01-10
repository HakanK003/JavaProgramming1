package day23_CustomMethod;

public class PrintEvenNumber1to100 {

    public static void main(String[] args) {

        evenNumbers1to100();

    }

    public static void evenNumbers1to100(){
        for (int i = 0; i <=100 ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}

/*
create a method that can print even numbers between 1~100 in a same line separated by space

 */