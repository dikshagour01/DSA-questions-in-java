import java.util.*;

public class queue_deque {
    static class customQueue {
        Deque<Integer> dq = new LinkedList<>();

        // add()
        public void add(int data) {
            dq.addLast(data);
        }

        // remove()
        public int remove() {
            return dq.removeFirst();
        }

        // peek()
        public int peek() {
            return dq.getFirst();
        }

        @Override
        public String toString() {
            return dq.toString();
        }
    }

    public static void main(String args[]) {
        customQueue q = new customQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        System.out.print(q);
    }
}
