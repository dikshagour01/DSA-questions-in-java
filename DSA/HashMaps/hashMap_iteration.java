import java.util.*;
public class hashMap_iteration{
    public static void main(String args[]){
        HashMap <String,Integer> hm = new HashMap<>();

     // Insert HashMap - O(1)
        hm.put("India",200);
        hm.put("China",150);
        hm.put("US",100);
        hm.put("Europe",130);
        hm.put("Switzerland",120);

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        // used for each loop to iterate over all the keys
        for(String k:keys){
            System.out.println("keys : "+k +", value : "+hm.get(k));
        }

        // entrySet return key value pair
        Set<Map.Entry<String,Integer>> pair = hm.entrySet();
        System.out.println(pair);


    }
}