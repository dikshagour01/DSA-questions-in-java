public class rotate_image {
    public static int[][] rotate_matrix(int matrix[][]) {
        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int low = 0;
            int high = n - 1;
            while (low < high) {
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++;
                high--;
            }
        }

        return matrix;
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {2, 3, 4},
            {1, 6, 7},
            {4, 6, 8}
        };

        int[][] rotatedMatrix = rotate_matrix(matrix);

        // Print the rotated matrix
        for (int i = 0; i < rotatedMatrix.length; i++) {
            for (int j = 0; j < rotatedMatrix[i].length; j++) {
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
