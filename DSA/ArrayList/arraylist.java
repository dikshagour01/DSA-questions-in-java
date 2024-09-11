import java.util.ArrayList;
public class arraylist{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        // Add operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.print(list);
        System.out.println();

        //get operation
        System.out.println(list.get(2));

        //remove operation
        list.remove(2);
        System.out.print(list);
        System.out.println();

        //set operation
        list.set(2,10);
        System.out.print(list);
        System.out.println();

        //contains.operation
        System.out.println(list.contains(18));

        //size of list
        System.out.println(list.size());

    }
}