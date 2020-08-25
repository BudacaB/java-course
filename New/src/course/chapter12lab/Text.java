package course.chapter12lab;

public class Text implements Drawable {
    String value;

    public Text(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void draw() {
        System.out.println(value);
    }
}
