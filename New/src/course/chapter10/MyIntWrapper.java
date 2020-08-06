package course.chapter10;

import java.util.Objects;

public class MyIntWrapper {
    private int value;

    public MyIntWrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "MyIntWrapper{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyIntWrapper that = (MyIntWrapper) o;
        return value == that.value;
    }
}
