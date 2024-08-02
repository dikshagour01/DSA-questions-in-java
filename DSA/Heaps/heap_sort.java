import java.util.*;

public class heap_sort {

    // Function to heapify a subtree rooted with node i which is an index in arr[].
    // size is the size of the heap.
    public static void heapify(int arr[], int i, int size) {
        int left = 2 * i + 1; // left child
        int right = 2 * i + 2; // right child
        int maxIdx = i; // initialize largest as root

        // If left child is larger than root
        if (left < size && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }

        // If right child is larger than the largest so far
        if (right < size && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }

        // If largest is not root
        if (i != maxIdx) {
            // Swap arr[i] with arr[maxIdx]
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, maxIdx, size);
        }
    }

    // Main function to perform heap sort
    public static void HeapSort(int arr[]) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end (swap arr[0] with arr[i])
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call max heapify on the reduced heap
            heapify(arr, 0, i);
        }
    }

    public static void main(String args[]) {
        // Input array
        int arr[] = {1, 2, 4, 5, 3};
        
        // Perform heap sort
        HeapSort(arr);
        
        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
