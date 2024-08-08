public class Quick_sort {
    // QuickSort function
    public static void quickSort(int arr[], int si, int ei) {
        // Base condition for recursion: if the starting index is greater than or equal to the ending index, return
        if (si >= ei) {
            return;
        }
        // Partition the array and get the partition index
        int pIdx = partition(arr, si, ei);
        // Recursively sort the left subarray
        quickSort(arr, si, pIdx - 1);
        // Recursively sort the right subarray
        quickSort(arr, pIdx + 1, ei);
    }

    // Partition function to place the pivot element at the correct position
    public static int partition(int arr[], int si, int ei) {
        int i = si - 1; // Initialize the smaller element index
        int pivot = arr[ei]; // Choose the pivot element

        // Traverse through the array and rearrange elements based on pivot
        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) { // If the current element is smaller than the pivot
                i++; // Increment the smaller element index
                // Swap arr[i] and arr[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // Swap the pivot element with the element at i+1 position
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i; // Return the partition index
    }

    // Utility function to print the array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print each element
        }
        System.out.println(); // Move to the next line after printing the array
    }

    // Main function to test the QuickSort implementation
    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 3, 2, 5}; // Initialize the array
        quickSort(arr, 0, arr.length - 1); // Call QuickSort on the entire array
        printArr(arr); // Print the sorted array
    }
}
