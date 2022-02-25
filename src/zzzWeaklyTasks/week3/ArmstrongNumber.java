package zzzWeaklyTasks.week3;

public class ArmstrongNumber {

    public static void main(String[] args) {

        System.out.println(isArmstrong(153)); // (1*1*1)+(5*5*5)+(3*3*3) = 153
                                                 //    1   +  125  +   27  =   153  true

        System.out.println(isArmstrong(3));   //  3*1   =  3
                                                //    3    =  3       true

        System.out.println(isArmstrong(23)); //  (2*2) + (3*3) != 23  false
                                                //    4 +   9   = 13
    }

    public static boolean isArmstrong(int a){

        int result = 0;

        int b = a;

        int c = a;

        int i = 1;

        while(a>=10){
            a=a/10;
            i++;
        }

        for (int j = i; j >= i; j--) {


            for (int k = 1; k < j; k++) {

                b=b/10;

            }

            int d = b;

            for (int m = 1; m < i; m++) {
                b*=d;
            }

            result+=b;

        }

    return c==result;
    }


}

/*
Write a method that can check if a number is Armstrong or not
 */