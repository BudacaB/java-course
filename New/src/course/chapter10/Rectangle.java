package course.chapter10;

import java.util.Objects;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return height == rectangle.height &&
                width == rectangle.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 5);
        Rectangle r2 = r1; //new Rectangle(5, 5);

        if (r1 == r2)
            System.out.println("Rectangles are ==");

        if (r1.equals(r2))
            System.out.println("Rectangles are 'equal'");
    }
}
