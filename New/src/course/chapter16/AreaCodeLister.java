package course.chapter16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class AreaCodeLister {
//    private HashMap<String, String> areaCodes;
//    private HashMap<String, String> abbreviations;
//    private LinkedHashMap<String, String> areaCodes;
//    private LinkedHashMap<String, String> abbreviations;
    private TreeMap<String, String> areaCodes;
    private TreeMap<String, String> abbreviations;

    public AreaCodeLister(TreeMap<String, String> areaCodes, TreeMap<String, String> abbreviations) {
        this.areaCodes = areaCodes;
        this.abbreviations = abbreviations;
    }

    public AreaCodeLister() {
        populateAreaCodes();
        populateAbbreviatios();
        print();
    }

    private void print() {
        Set<String> s = areaCodes.keySet();
        Iterator<String> it = s.iterator();

//        Set<String> s2 = abbreviations.keySet();
//        Iterator<String> it2 = s2.iterator();

//        while (it.hasNext()) {
//            System.out.println(it.next() + " " + it2.next());
//        }

        while (it.hasNext()) {
            String code = it.next();
            String abbrv = areaCodes.get(code);
            String state = abbreviations.get(abbrv);
            System.out.println(code + " " + state);
        }
    }

    private void populateAbbreviatios() {
        abbreviations = new TreeMap<>();

        try (BufferedReader in = new BufferedReader(new FileReader("abbreviations.txt"))) {
            String line = null;
            while ((line = in.readLine()) != null) {
                String[] tokens = line.split(" ");
                abbreviations.put(tokens[1], tokens[0]); // or continue with HashMap but add the abbreviations first
            }
        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
        System.out.println(abbreviations);
    }

    private void populateAreaCodes() {
        areaCodes = new TreeMap<>();

        try (BufferedReader in = new BufferedReader(new FileReader("areacodes.txt"))) {
            String line = null;
            while ((line = in.readLine()) != null) {
                String[] tokens = line.split(" ");
                areaCodes.put(tokens[0], tokens[1]);
            }
        } catch(IOException e) {
            System.err.println(e);
            System.exit(1);
        }
        System.out.println( areaCodes);
    }

    public static void main(String[] args) {
        new AreaCodeLister();
    }
}
