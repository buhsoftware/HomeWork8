public class TestShape {
    public static void main(String[] args) {

        //Point
        Point point = new Point(2, 3);
        System.out.println(point);
        System.out.println("point.getName() = " + point.getName());
        System.out.println();

        //Line
        Line line = new Line(new Point(2, 3), new Point(4, 5));
        System.out.println(line);
        System.out.println("line.getName() = " + line.getName());
        System.out.println();

        //Circle
        Circle circle = new Circle(5, point);
        System.out.println(circle);
        System.out.println("circle.getName() = " + circle.getName());
        System.out.println("circle.getSquare() = " + circle.getSquare());
        System.out.println();

        //Quad
        Quad quad = new Quad(new Point(5, 6), 5);
        System.out.println(quad);
        System.out.println("quad.getName() = " + quad.getName());
        System.out.println("quad.getSquare() = " + quad.getSquare());
        System.out.println();

        //Rectangle
        Rectangle rectangle = new Rectangle(new Point(6, 7), 5, 6);
        System.out.println(rectangle);
        System.out.println("rectangle.getName() = " + rectangle.getName());
        System.out.println("rectangle.getSquare() = " + rectangle.getSquare());
    }
}
