package course.chapter16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        CD cd1 = new CD(1, "The Beatles", "The Beatles 1");
        CD cd2 = new CD(2, "Prince", "The very best of Prince");
        CD cd3 = new CD(3, "Garth Brooks", "The Ultimate Hits");
        CD cd4 = new CD(3, "Garth Brooks", "The Ultimate Hits");

//        Set<CD> cdCollection = new HashSet<>();
        Set<CD> cdCollection = new LinkedHashSet<>();

        cdCollection.add(cd1);
        cdCollection.add(cd2);
        cdCollection.add(cd3);
        cdCollection.add(cd4);

        System.out.println(cdCollection.size());

        Iterator<CD> it = cdCollection.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
