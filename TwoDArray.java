public class TwoDArray {
    public static void main(String[] args) {
        // Creating a 2D array (3x3)
        int[][] matrix = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}
        };
        
        // Accessing elements of the 2D array
        System.out.println("Element at (0,0): " + matrix[0][0]); // First row, first column
        System.out.println("Element at (0,2): " + matrix[0][2]); // First row, third column
        System.out.println("Element at (1,1): " + matrix[1][1]); // Second row, second column
        System.out.println("Element at (2,1): " + matrix[2][1]); // Third row, second column
    }
}
