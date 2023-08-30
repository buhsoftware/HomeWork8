import java.util.Objects;

public class Quad extends Shape implements Squarable {

    private Point startPoint;
    private double sideLength;

    public Quad(Point startPoint, double sideLength) {
        this.startPoint = startPoint;
        this.sideLength = sideLength;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quad quad = (Quad) o;
        return Double.compare(quad.sideLength, sideLength) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideLength);
    }

    @Override
    public String toString() {
        return "Quad{" +
                "startPoint=" + startPoint +
                ", sideLength=" + sideLength +
                '}';
    }

    @Override
    String getName() {
        return "Quad";
    }

    @Override
    public double getSquare() {
        return sideLength * sideLength;
    }

}
