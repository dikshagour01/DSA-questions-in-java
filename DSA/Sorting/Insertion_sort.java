public class Insertion_sort {
    // Function to perform Insertion Sort on an array
    public static void InsertionSort(int arr[]) {
        // Start from the second element (i=1), as the first element is considered sorted
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];  // Current element to be inserted
            int prev = i - 1;   // Previous index (element before the current one)

            // Find the correct position to insert the current element by shifting elements
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];  // Shift the larger element one position to the right
                prev--;  // Move to the previous element in the array
            }

            // Insert the current element at the found position
            arr[prev + 1] = curr;
        }
    }

    // Function to print the array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // Print each element followed by a space
        }
        System.out.println();  // Move to the next line after printing the array
    }

    // Main method to test the Insertion Sort algorithm
    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};  // Sample unsorted array
        InsertionSort(arr);  // Call the InsertionSort function to sort the array
        printArr(arr);    // Call the printArr function to display the sorted array
    }
}
