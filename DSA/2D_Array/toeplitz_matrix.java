public class toeplitz_matrix{
    public static boolean toeplitz_matrix(int matrix[][]){
        int row=matrix.length;
        int col=matrix[0].length;

        for(int i=0; i<row-1; i++){
            for(int j=0; j<col-1; j++){
                if(matrix[i][j] != matrix[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
        {5,1,2,3},
        {9,5,1,2},
        {0,9,5,1}};

        System.out.println(toeplitz_matrix(matrix));
    }
}