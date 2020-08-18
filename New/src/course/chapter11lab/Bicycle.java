package course.chapter11lab;

public class Bicycle extends Vehicle {

    private int numberOfGears;

    public Bicycle(int maxSpeed, int numberOfGears) {
        super(maxSpeed, 2);
        this.numberOfGears = numberOfGears;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "numberOfGears=" + numberOfGears +
                '}';
    }
}
