package day17_WhileDoWhile;

public class LoopPractices {

    public static void main(String[] args) {

        for (int i=0; i<=10; i++){
            System.out.println(i);
        }

        System.out.println("----------------------------------------");

        int j = 1;
        while(j<=10){
            //j++; ==>2~11
            System.out.println(j);
            j++;  //==>1~10
        }

        System.out.println("----------------------------------------");

        int k =1;

        do{
            System.out.println(k);
            k++;
        }while(k<=10);



    }
}
