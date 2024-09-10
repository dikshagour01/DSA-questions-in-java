public class Bubble_sort {
    // Bubble Sort function to sort the array
    public static void BubbleSort(int arr[]) {
        // Total number of turns (pass through the array)
        for (int turn = 0; turn <= arr.length - 2; turn++) {
            int swap = 0;  // Counter to check if any swaps were made

            // Compare adjacent elements and swap if needed
            for (int j = 0; j <= arr.length - 2 - turn; j++) {
                // If the current element is greater than the next, swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;  // Increment swap counter
                }
            }

            // If no swaps were made in the current pass, the array is already sorted
            if (swap == 0) {
                break;  // Exit the loop early to avoid unnecessary iterations
            }
        }
    }

    // Function to print the array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method to test the Bubble Sort algorithm
    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};  // Sample unsorted array
        BubbleSort(arr);  // Sort the array
        printArr(arr);    // Print the sorted array
    }
}
