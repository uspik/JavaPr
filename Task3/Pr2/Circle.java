package Task3.Pr2;

public class Circle {
    private double radius;
    private Point centre;


    public Circle(Point centre, double radius){
        this.radius = radius;
        this.centre = centre;
    }

    public Point getCentre() {
        return centre;
    }

    public double getRadius() {
        return radius;
    }
    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String toString() {
        return " x = " + this.centre.getX() + " y=" + this.centre.getY() + " Радиус=" + this.radius;
    }
}