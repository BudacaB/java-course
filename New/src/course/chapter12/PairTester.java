package course.chapter12;

public class PairTester {
    public static void main(String[] args) {
        Pair p1 = new Pair("ABC", "XYZ");
        Pair p2 = new Pair(1, 2);

        if (p1.getFirst() instanceof String) {
            String s = (String) p1.getFirst();
            System.out.println(s);
        }
    }
}
