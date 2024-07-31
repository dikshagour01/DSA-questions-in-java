import java.util.*;

public class stack_queue {
    static class CustomStack {
        Deque<Integer> dq = new LinkedList<>();

        // add()
        public void push(int data) {
            dq.addLast(data);
        }

        // remove()
        public int pop() {
            return dq.removeLast();
        }

        // peek()
        public int peek() {
            return dq.getLast();
        }

        @Override
        public String toString() {
            return dq.toString();
        }
    }

    public static void main(String args[]) {
        CustomStack s = new CustomStack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        System.out.print(s);
    }
}
