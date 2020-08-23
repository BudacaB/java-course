package course.chapter12;

public class PairTester {
    public static void main(String[] args) {
        Pair<String> p1 = new Pair<>("ABC", "XYZ");
        Pair<Integer> p2 = new Pair<>(1, 2);

        if (p1.getFirst() instanceof String) {
            String s = p1.getFirst();
            System.out.println(s);
        }
    }
}
