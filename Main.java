class RectangleArea {
    int length;
    int breadth;

    RectangleArea(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int getArea() {
        return length * breadth;
    }
}


class RectanglePerimeter extends RectangleArea {


    RectanglePerimeter(int length, int breadth) {
        super(length, breadth);
    }

    int getPerimeter() {
        return 2 * (length + breadth);
    }
}

public class Main {
    public static void main(String[] args) {
        RectanglePerimeter rect = new RectanglePerimeter(10, 5);
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
}
}