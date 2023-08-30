import java.util.Objects;

public class Circle extends Shape implements Squarable {

    private double radius;
    private Point startPoint;

    public Circle(double radius, Point startPoint) {
        this.radius = radius;
        this.startPoint = startPoint;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", startPoint=" + startPoint +
                '}';
    }

    @Override
    public double getSquare() {
        return PI * radius * radius;
    }

    @Override
    String getName() {
        return "Circle";
    }
}
