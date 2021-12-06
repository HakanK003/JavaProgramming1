package day17_WhileDoWhile;

public class BranchingStatements2 {

    public static void main(String[] args) {

        for (char i = 'A'; i<= 'E'; i++){

            if (i=='C'){
                continue;
            }

            System.out.println(i);
        }

        System.out.println("-----------------------------------");

        for (int i = 1; i<11; i++){//print odd numbers
            if (i%2==0){continue;}
            System.out.println(i);
        }

        System.out.println("-----------------------------------");

        for (int a=1; a<11; a++){//print even numbers
            if (a%2!=0){continue;}
            System.out.println(a);
        }


    }
}
