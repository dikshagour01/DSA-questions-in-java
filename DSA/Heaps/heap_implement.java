import java.util.*;

public class heap_implement {
    static class heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // Add at last index
            arr.add(data);

            int child = arr.size() - 1;
            int par = (child - 1) / 2;

            while (child > 0 && arr.get(child) < arr.get(par)) {
                // Swap
                int temp = arr.get(child);
                arr.set(child, arr.get(par));
                arr.set(par, temp);

                child = par;
                par = (child - 1) / 2;
            }
        }

        public int peek() {
            if (arr.size() == 0) {
                throw new NoSuchElementException("Heap is empty");
            }
            return arr.get(0);
        }

        public void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(left) < arr.get(minIdx)) {
                minIdx = left;
            }

            if (right < arr.size() && arr.get(right) < arr.get(minIdx)) {
                minIdx = right;
            }

            if (minIdx != i) {
                // Swap with root element
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                // Recursively heapify the affected sub-tree
                heapify(minIdx);
            }
        }

        public int remove() {
            if (arr.size() == 0) {
                throw new NoSuchElementException("Heap is empty");
            }
            int data = arr.get(0);

            // First step - swap first element with last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // Second step - remove last element
            arr.remove(arr.size() - 1);

            // Fix heap using heapify function
            if (arr.size() > 0) {
                heapify(0);
            }
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        heap h = new heap();
        h.add(1);
        h.add(5);
        h.add(3);
        h.add(4);

        while (!h.isEmpty()) {
            System.out.print(h.peek() + " ");
            h.remove();
        }
    }
}
