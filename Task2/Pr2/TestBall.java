package Task2.Pr2;

public class TestBall {
    public static void main(String args[]) {
        Ball Ba = new Ball(4, 3);
        System.out.println(Ba);
        System.out.println(Ba.getX());
        System.out.println(Ba.getY());
        Ba.setX(5);
        Ba.setY(13);
        System.out.println(Ba.getX());
        System.out.println(Ba.getY());
        Ba.setXY(6, 3);
        System.out.println(Ba.getX());
        System.out.println(Ba.getY());
        Ba.move(1, 11);
        System.out.println(Ba.getX());
        System.out.println(Ba.getY());
    }
}
