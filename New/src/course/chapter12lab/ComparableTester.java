package course.chapter12lab;

public class ComparableTester {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10, 4);
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        System.out.println("Rectangles "  + r1.compareTo(r2));
        System.out.println("Circles " + c1.compareTo(c2));
    }
}
