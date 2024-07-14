// Print Data in sorted form of key

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("India", 1000);
        tm.put("China", 500);
        tm.put("US", 300);
        
        System.out.println(tm);
    }
}
