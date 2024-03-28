import java.util.LinkedList;
public class linkedList4{
    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addFirst(0);
        ll.addLast(1);
        ll.addLast(2);

        //print
        System.out.println(ll);

        //remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}