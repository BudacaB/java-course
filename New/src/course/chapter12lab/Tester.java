package course.chapter12lab;

public class Tester {
    public static void main(String[] args) {
        Drawable[] shapes = new Drawable[3];

        shapes[0] = new Rectangle();
        shapes[1] = new Text("test");
        shapes[2] = new Circle(8);

        for (Drawable shape : shapes) {
            shape.draw();
        }
    }
}
