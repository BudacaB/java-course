package course.chapter12;

public class Pair <T>{
    private T first;
    private T second;

    public Pair(T one, T two) {
        this.first = one;
        this.second = two;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
