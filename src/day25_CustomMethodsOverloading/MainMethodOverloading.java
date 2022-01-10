package day25_CustomMethodsOverloading;

public class MainMethodOverloading {

    //interview question ==> can main method overloaded? yes it can but works only original one no benefits
    public static void main(String[] args) {
        System.out.println("String");

    }

    public static void main(int[] args) {
        System.out.println("int");

    }

    public static void main(double[] args) {
        System.out.println("double");

    }
    

    public static void main(char[] args) {
        System.out.println("char");

    }
}
