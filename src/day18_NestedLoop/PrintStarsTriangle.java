package day18_NestedLoop;

public class PrintStarsTriangle {

    public static void main(String[] args) {

        for (int i=1; i<11; i++){
            System.out.println("* ".repeat(i));
        }
    }
}

/*
Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
 */