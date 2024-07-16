import java.util.*;
public class hashset{
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();

        // add in hashSet
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(2);

        System.out.println(set);

        //contains key
        System.out.println(set.contains(4));  //true

        //remove key
        set.remove(2);
        System.out.println(set);

        //size of hashset
        System.out.println(set.size());

        //clear
        set.clear();

        //isEmpty()
        System.out.println(set.isEmpty());





    }
}