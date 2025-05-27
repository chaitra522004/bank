
class CircleArea {
    double radius;

    CircleArea(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class RectanglePerimeter {
    double length, breadth;

    RectanglePerimeter(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea() {
        return length * breadth;
    }

    double getPerimeter() {
        return 2 * (length + breadth);
    }
}

public class Main1{
    public static void main(String[] args) {
        double radius = 5.0;
        double length = 4.0;
        double breadth = 6.0;
        CircleArea circle = new CircleArea(radius);
        System.out.println("Circle:");
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + circle.getArea());
        System.out.println("Perimeter = " + circle.getPerimeter());

        RectanglePerimeter rectangle = new RectanglePerimeter(length, breadth);
        System.out.println("\nRectangle:");
        System.out.println("Length = " + length + ", Breadth = " + breadth);
        System.out.println("Area = " + rectangle.getArea());
        System.out.println("Perimeter = " + rectangle.getPerimeter());
}
}