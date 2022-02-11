package day43_Abstraction.shapeTask;

public class Paper {

    public static void main(String[] args) {

        Square square1 = new Square(3);
        Rectangle rectangle1 = new Rectangle(3, 5);
        Circle circle1 = new Circle(3);

        System.out.println(square1);
        System.out.println(rectangle1);
        System.out.println(circle1);

    }

}
