package course.chapter11lab;

public class Vehicle {

    private int maxSpeed;
    private int numberOfWheels;

    public Vehicle(int maxSpeed, int numberOfWheels) {
        this.maxSpeed = maxSpeed;
        this.numberOfWheels = numberOfWheels;
    }

    public Vehicle() {
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "maxSpeed=" + maxSpeed +
                ", numberOfWheels=" + numberOfWheels +
                '}';
    }
}
