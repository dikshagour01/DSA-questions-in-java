import java.util.*;
public class hashMap{
    public static void main(String args[]){          //implement hash map for countary and population
        HashMap <String,Integer> hm = new HashMap<>();

     // Insert HashMap - O(1)
        hm.put("India",200);
        hm.put("China",150);
        hm.put("US",100);

        System.out.println(hm);

    // Get  HashMap - O(1)
        int population = hm.get("India");
        System.out.println(population);

    // Contains ket -O(1)
        System.out.println(hm.containsKey("US"));
        System.out.println(hm.containsKey("Indonesia"));  // return false as indonesia do not exist

    // Remove key -O(1)
        hm.remove("China");
        System.out.println(hm);

    // size of hashmap 
        System.out.println(hm.size());

    // isEmpty 
    System.out.println(hm.isEmpty());

    // you can use .clear() to clear the map 

    }
}