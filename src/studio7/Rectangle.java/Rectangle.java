public class Rectangle {
 
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public boolean isSmaller(Rectangle other) {
        return this.getArea() < other.getArea();
    }

    public boolean isSquare() {
        return length == width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width +
               ", area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(3, 3);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("r1 smaller than r2? " + r1.isSmaller(r2));
        System.out.println("r2 is square? " + r2.isSquare());
    }
}
