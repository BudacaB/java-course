package course.chapter10;

public class Clock {
    private int hour;
    private int minute;
    private int second;
    private StringBuilder manufacturer;

    public Clock() {
    }

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.manufacturer = new StringBuilder("");
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour > 12)
            hour = hour - 12;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public StringBuilder getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(StringBuilder manufacturer) {
        manufacturer.append(" Corporation");
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Clock{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                ", manufacturer=" + manufacturer +
                '}';
    }

    protected void finalize() {
        System.out.println("finalize called");
    }

    public static void main(String[] args) {
        Clock clock = new Clock(10, 18, 0);
        int theHour = 19;
        StringBuilder theManufacturer = new StringBuilder("Timex");
        clock.setHour(theHour);
        clock.setManufacturer(theManufacturer);

        System.out.println(clock);
        System.out.println(theHour);
        System.out.println(theManufacturer);
    }
}
