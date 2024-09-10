public class Selection_sort {
    // Function to perform Selection Sort on an array
    public static void SelectionSort(int arr[]) {
        // Loop through the array, considering each element as the starting point
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;  // Assume the first element of the unsorted portion is the minimum

            // Loop to find the actual minimum element in the remaining unsorted portion
            for (int j = i + 1; j < arr.length; j++) {
                // If a smaller element is found, update the minPos
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted portion
            int temp = arr[minPos];  // Store the minimum element temporarily
            arr[minPos] = arr[i];    // Move the element at index i to the minPos
            arr[i] = temp;           // Move the minimum element to its correct position
        }
    }

    // Function to print the array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // Print each element followed by a space
        }
        System.out.println();  // Move to the next line after printing the array
    }

    // Main method to test the Selection Sort algorithm
    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};  // Sample unsorted array
        SelectionSort(arr);  // Call the SelectionSort function to sort the array
        printArr(arr);    // Call the printArr function to display the sorted array
    }
}
