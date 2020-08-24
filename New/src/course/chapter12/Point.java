package course.chapter12;

import java.util.Objects;

public class Point implements Comparable<Point> {
    private int xCoordinate;
    private int yCoordinate;

    public Point(int x, int y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return xCoordinate == point.xCoordinate &&
                yCoordinate == point.yCoordinate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCoordinate, yCoordinate);
    }

    @Override
    public String toString() {
        return "Point(" + xCoordinate + " " + yCoordinate +
                ")";
    }

    @Override
    public int compareTo(Point other) {
        if (this.xCoordinate < other.xCoordinate)
            return -1;
        else if (this.xCoordinate > other.xCoordinate)
            return 1;
        else if (this.yCoordinate < other.yCoordinate)
            return -1;
        else if (this.yCoordinate > other.yCoordinate)
            return 1;
        else
            return 0;
    }
}
