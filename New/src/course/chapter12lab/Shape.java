package course.chapter12lab;

public abstract class Shape implements Drawable, Comparable<Shape> {
    private int xCoordinate;
    private int yCoordinate;
    private Color color;

    public Shape(int xCoordinate, int yCoordinate, Color color) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.color = color;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract float getArea();

    @Override
    public int compareTo(Shape other) {
        if (this.getArea() < other.getArea())
            return -1;
        else if (this.getArea() > other.getArea())
            return 1;
        else
            return 0;
    }
}
