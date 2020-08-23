package course.chapter12;

public class Pair {
    private Object first;
    private Object second;

    public Pair(Object one, Object two) {
        this.first = one;
        this.second = two;
    }

    public Object getFirst() {
        return first;
    }

    public void setFirst(Object first) {
        this.first = first;
    }

    public Object getSecond() {
        return second;
    }

    public void setSecond(Object second) {
        this.second = second;
    }
}
