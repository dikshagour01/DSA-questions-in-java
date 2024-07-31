import java.util.*;

public class stack_queue {
    public static class stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public void add(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            int top = -1;
            if (!q1.isEmpty()) {   // case 1
                while (!q1.isEmpty()) {
                    top = q1.poll();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            } else {              // case 2
                while (!q2.isEmpty()) {
                    top = q2.poll();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            int top = -1;
            if (!q1.isEmpty()) {   // case 1
                for (int i = 0; i < q1.size(); i++) {
                    top = q1.poll();
                    q2.add(top);
                }
            } else {              // case 2
                for (int i = 0; i < q2.size(); i++) {
                    top = q2.poll();
                    q1.add(top);
                }
            }
            return top;
        }
    }

    public static void main(String args[]) {
        stack q = new stack();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
