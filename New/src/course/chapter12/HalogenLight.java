package course.chapter12;

public class HalogenLight extends Light {
    @Override
    public void changeBulb() {
        System.out.println("Change bulb in halogen lamp");
        System.out.println("Dispose of old bulb properly");
    }
}
