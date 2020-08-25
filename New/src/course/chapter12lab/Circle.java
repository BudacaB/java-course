package course.chapter12lab;

public class Circle extends Shape {
    private double radius;

    public Circle(int xCoordinate, int yCoordinate, Color color, double radius) {
        super(xCoordinate, yCoordinate, color);
        this.radius = radius;
    }

    public Circle(double radius) {
        this(0, 0, Color.RED, radius);
    }

    public Circle() {
        this(0, 0, Color.RED, 5);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void draw() {
        System.out.println("This is a " + this.getClass().getName());
        System.out.println("Coordinates " + getxCoordinate() + " " + getyCoordinate());
        System.out.println("Color " + getColor());
    }
}
