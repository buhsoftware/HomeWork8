import java.util.Objects;

public class Line extends Shape {
    private Point A;
    private Point B;

    public Line(Point a, Point b) {
        A = a;
        B = b;
    }

    public Point getA() {
        return A;
    }

    public void setA(Point a) {
        A = a;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point b) {
        B = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(A, line.A) && Objects.equals(B, line.B);
    }

    @Override
    public int hashCode() {
        return Objects.hash(A, B);
    }

    @Override
    public String toString() {
        return "Line{" +
                "A=" + A +
                ", B=" + B +
                '}';
    }

    @Override
    String getName() {
        return "Line";
    }
}
