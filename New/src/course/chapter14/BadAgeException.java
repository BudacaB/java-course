package course.chapter14;

public class BadAgeException extends Exception {
    @Override
    public String getMessage() {
        return "Invalid age";
    }
}
