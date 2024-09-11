import java.util.*;
public class SortList{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        // Add operation
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(8);
        list.add(3);

        Collections.sort(list);
        System.out.println(list);
    }
}