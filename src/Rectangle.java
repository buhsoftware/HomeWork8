import java.util.Objects;

public class Rectangle extends Shape implements Squarable {

    private Point startPoint;
    private double sideLengthA;
    private double sideLengthB;

    public Rectangle(Point startPoint, double sideLengthA, double sideLengthB) {
        this.startPoint = startPoint;
        this.sideLengthA = sideLengthA;
        this.sideLengthB = sideLengthB;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public double getSideLengthA() {
        return sideLengthA;
    }

    public void setSideLengthA(double sideLengthA) {
        this.sideLengthA = sideLengthA;
    }

    public double getSideLengthB() {
        return sideLengthB;
    }

    public void setSideLengthB(double sideLengthB) {
        this.sideLengthB = sideLengthB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.sideLengthA, sideLengthA) == 0 && Double.compare(rectangle.sideLengthB, sideLengthB) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideLengthA, sideLengthB);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "startPoint=" + startPoint +
                ", sideLengthA=" + sideLengthA +
                ", sideLengthB=" + sideLengthB +
                '}';
    }

    @Override
    String getName() {
        return "Rectangle";
    }

    @Override
    public double getSquare() {
        return sideLengthA * sideLengthB;
    }

}
