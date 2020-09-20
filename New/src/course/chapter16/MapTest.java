package course.chapter16;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        CD cd1 = new CD(1, "The Beatles", "The Beatles 1");
        CD cd2 = new CD(2, "Prince", "The very best of Prince");
        CD cd3 = new CD(3, "Garth Brooks", "The Ultimate Hits");

//        Map<String, CD> cdCollection = new HashMap<>();
//        Map<String, CD> cdCollection = new LinkedHashMap<>();
        Map<String, CD> cdCollection = new TreeMap<>();

        cdCollection.put("A00047AV3", cd1);
        cdCollection.put("Z0005M989", cd2);
        cdCollection.put("B000VT30I", cd3);

        Set<String> s = cdCollection.keySet();
        Iterator<String> it = s.iterator();

        while (it.hasNext()) {
            String key = it.next();
            System.out.println("Key: " + key);
            System.out.println("Value: " + cdCollection.get(key));
        }
    }
}
