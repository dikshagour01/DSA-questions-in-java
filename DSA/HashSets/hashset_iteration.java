import java.util.*;
public class hashset_iteration{
    public static void main(String args[]){
        HashSet<String> cities = new HashSet<>();
        cities.add("Jaipur");
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Pune");

        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // using advanced for loop
        for(String city : cities){
            System.out.println(city);
        }
    }
}