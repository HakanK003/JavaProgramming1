package day24_CustumMethodsReturn;

public class UniqueElementsOfArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,2,3,4,4,5,6,6,7,8,8,8,9};
        uniqueFinder(numbers);
    }
    public static void uniqueFinder(int[] numbers){

        String result="";
        for (int eachNum : numbers) {
            int count =0;
            for (int checker : numbers) {
                if (eachNum==checker){count++;}
            }
            if (count==1){result+=eachNum+" ";}
        }
        System.out.println(result.trim());
    }
}

/*
create a method that can display the unique elements of array
 */