public class transpose_matrix {
    public static int[][] transposeMatrix(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;

        int arr[][] = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                arr[i][j] = matrix[j][i];
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };

        int resultMatrix[][] = transposeMatrix(matrix);
        
        // Printing the transposed matrix
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
