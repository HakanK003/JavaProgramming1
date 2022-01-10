package day26_CustomMethodPractice;

public class FrequencyOfElements {

    public static void main(String[] args) {

        int[] numbers1 ={1, 2, 3, 4, 5, 6, 1, 1, 1, 2, 3};
        System.out.println("Frequency of the element = "+frequencyOfElement(numbers1,2));

        double[] numbers2 ={1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 1.1, 1.1, 1.1, 2.2, 3.3};
        System.out.println("Frequency of the element = "+frequencyOfElement(numbers2,2.2));

        char[] chars ={'a', 'a', 'b', 'c', 'd', 'a', 'a', 'b'};
        System.out.println("Frequency of the element = "+frequencyOfElement(chars,'a'));

        String[] str ={"Hello", "Hello", "Java", "Hello", "Java"};
        System.out.println("Frequency of the element = "+frequencyOfElement(str,"Java"));


    }
    //return frequency of int from int array
    public static  int frequencyOfElement(int[] arr, int num){

        int count =0;
        for (int each : arr) {
            if (each==num){count++;}
        }
        return count;
    }
    //return frequency of double from double array
    public static int frequencyOfElement(double[] arr, double num){

        int count =0;
        for (double each : arr) {
            if (each==num){count++;}
        }
        return count;
    }
    //return frequency of char from char array
    public static int frequencyOfElement(char[] arr, char ch){

        int count =0;
        for (char each : arr) {
            if (each==ch){count++;}
        }
        return count;
    }
    //return frequency of String from String array
    public static int frequencyOfElement(String[] arr, String str){

        int count =0;
        for (String each : arr) {
            if (each.equals(str)){count++;}
        }
        return count;
    }
}

/*
 Create a class named FrequencyOfElements:
            1.1 Create a method that passes two parameters: an integer array and an Integer element.
            The method returns the frequency of the given integer element from the integer array

            1.2 Create a method that passes two parameters: a double array and a double element.
            The method returns the frequency of the given integer from the array

            1.3 Create a method that passes two parameters: a char array and a char element.
            The method returns the frequency of the given char element from the char array

            1.4 Create a method that passes two parameters: a String array and a String element.
            The method returns the frequency of the given String element from the String array
 */