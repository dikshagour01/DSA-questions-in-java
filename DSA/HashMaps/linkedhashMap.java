// print data in ordered form

import java.util.*;
public class linkedhashMap{
    public static void main(String args[]){
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();

        lhm.put("India",1000);
        lhm.put("China",500);
        lhm.put("US",300);
        System.out.println(lhm);
    }
}