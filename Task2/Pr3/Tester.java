package Task2.Pr3;

public class Tester {
    public static void main(String[] args) {
        Point Po1 = new Point(5, 7);
        Point Po2 = new Point(4, 3);
        Point Po3 = new Point(11, 2);

        Circle circle1 = new Circle(Po1, 0);
        Circle circle2 = new Circle(Po2, 1);
        Circle circle3 = new Circle(Po3, 2);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
    }
}
