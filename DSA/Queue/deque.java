import java.util.*;
public class deque{
    public static void main(String args[]){
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addLast(2);
        dq.addFirst(3);
        dq.addLast(4);
        System.out.println(dq);   // 3,1,2,4
        dq.removeFirst();
        System.out.println(dq);   //1,2,4
    }
}
