package day23_CustomMethod;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        helloWorld5Times();
        helloCydeo5Times();
        even1to10();

    }

    public static void helloWorld5Times(){
        for (int i = 0; i < 5; i++) {System.out.println("Hello World");}}
    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {System.out.println("Hello Cydeo");}}
    public static void even1to10(){
        for (int i = 0; i < 11; i+=2) {System.out.print(i+" ");}}
}
