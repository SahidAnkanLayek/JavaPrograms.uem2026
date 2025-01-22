public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int sum = 0;
        
        // Sum of diagonal elements
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];  // Main diagonal
            sum += matrix[i][matrix.length - i - 1];  // Anti-diagonal
        }
        
        // If the matrix size is odd, subtract the middle element once
        if (matrix.length % 2 != 0) {
            sum -= matrix[matrix.length / 2][matrix.length / 2];
        }

        System.out.println("Sum of diagonal elements: " + sum);
    }
}
