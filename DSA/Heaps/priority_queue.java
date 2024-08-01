import java.util.PriorityQueue;
import java.util.Comparator;
public class priority_queue{
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(2);
        pq.add(4);
        pq.add(1);
        pq.add(3);

        pq.remove();
        System.out.print(pq);
    }
}