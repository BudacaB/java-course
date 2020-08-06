package course.chapter10;

public class CellPhone {
    private String name;
    private String phoneNumber;
    private HW hardwareManufacturer;
    private OS operationSystem;

    public CellPhone(String name, String phoneNumber, HW hardwareManufacturer, OS operationSystem) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.hardwareManufacturer = hardwareManufacturer;
        this.operationSystem = operationSystem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public HW getHardwareManufacturer() {
        return hardwareManufacturer;
    }

    public void setHardwareManufacturer(HW hardwareManufacturer) {
        this.hardwareManufacturer = hardwareManufacturer;
    }

    public OS getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(OS operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", hardwareManufacturer=" + hardwareManufacturer +
                ", operationSystem=" + operationSystem +
                '}';
    }

    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone("Galaxy A40", "555-555", HW.SAMSUNG, OS.ANDROID);

        System.out.println(cellPhone);
    }
}
