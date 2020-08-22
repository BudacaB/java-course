package course.chapter12;

public class GasFireplace implements Switchable {
    private Status status;

    @Override
    public void turnOn() {
        status = Status.ON;
    }

    @Override
    public void turnOff() {
        status = Status.OFF;
    }

    @Override
    public String toString() {
        String className = this.getClass().getName();
        return "The " + className + " is turned " +
                status.toString().toLowerCase();
    }
}
