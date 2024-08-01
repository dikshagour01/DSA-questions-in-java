import java.util.*;

public class priority_object {
    static class student implements Comparable<student> {
        String name;
        int rank;

        student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(student s2) {
            return this.rank - s2.rank;
        }

        @Override
        public String toString() {
            return this.name + ": " + this.rank;
        }
    }

    public static void main(String args[]) {
        PriorityQueue<student> pq = new PriorityQueue<>();

        pq.add(new student("A", 3));
        pq.add(new student("B", 4));
        pq.add(new student("C", 5));
        pq.add(new student("D", 1));
        pq.add(new student("E", 2));

        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}
