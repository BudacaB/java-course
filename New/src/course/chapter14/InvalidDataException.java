package course.chapter14;

public class InvalidDataException extends Exception {
    private String name;

    public InvalidDataException(String name) {
        this.name = name;

    }

    @Override
    public String getMessage() {
        return "Name must be provided. You gave us: " + name;
    }
}
