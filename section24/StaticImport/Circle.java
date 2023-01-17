import static java.lang.Math.*;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getLargerRadius(double otherRadius) {
        return max(radius, otherRadius);
    }

    public double getSmallerRadius(double otherRadius) {
        return min(radius, otherRadius);
    }

    public double getRadiusSquared() {
        return pow(radius, 2);
    }

    public double getRadiusSquareRoot() {
        return sqrt(radius);
    }

}