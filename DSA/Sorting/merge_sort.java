public class merge_sort {

    // Recursive merge sort function
    public static void mergeSort(int arr[], int si, int ei) {
        // Base case: if the start index is greater than or equal to the end index, the array is already sorted
        if (si >= ei) {
            return;
        }

        // Find the middle index to divide the array into two halves
        int mid = si + (ei - si) / 2;

        // Recursively sort the left half
        mergeSort(arr, si, mid);

        // Recursively sort the right half
        mergeSort(arr, mid + 1, ei);

        // Merge the two sorted halves
        merge(arr, si, ei, mid);
    }

    // Merge function to merge two sorted parts of the array
    public static void merge(int arr[], int si, int ei, int mid) {
        // Temporary array to hold the merged result
        int temp[] = new int[ei - si + 1];

        // Indices for traversing the two sorted parts
        int i = si;      // Index for the first sorted part
        int j = mid + 1; // Index for the second sorted part
        int k = 0;       // Index for the temporary array

        // Merge elements from both sorted parts into the temporary array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from the first sorted part (if any)
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from the second sorted part (if any)
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy the sorted elements from temp array back to the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    // Function to print the array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Move to the next line after printing the array
    }

    // Main method to test merge sort
    public static void main(String args[]) {
        int arr[] = {6, 5, 8, 9, 1, 3};  // Sample unsorted array
        mergeSort(arr, 0, arr.length - 1);  // Correct bounds (0 to arr.length - 1)
        printArr(arr);  // Print the sorted array
    }
}
