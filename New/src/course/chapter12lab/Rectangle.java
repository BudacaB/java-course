package course.chapter12lab;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int xCoordinate, int yCoordinate, Color color, int width, int height) {
        super(xCoordinate, yCoordinate, color);
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height) {
        this(0, 0, Color.YELLOW, width, height);
    }

    public Rectangle() {
        this(0, 0, Color.YELLOW, 10, 10);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public float getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("This is a " + this.getClass().getName());
        System.out.println("Coordinates " + getxCoordinate() + " " + getyCoordinate());
        System.out.println("Color " + getColor());
    }
}
