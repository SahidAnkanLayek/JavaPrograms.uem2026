import java.util.Scanner;

public class FactorialSum {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for input
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        // Initialize sum with 11 as specified
        int sum = 11;
        
        // Loop through the numbers from 2 to n and calculate factorial sum
        for (int i = 2; i <= n; i++) {
            sum += factorial(i);
        }

        // Print the result
        System.out.println("The sum is: " + sum);
        
        // Close the scanner to avoid resource leak
        scanner.close();
    }

    // Method to calculate factorial of a number
    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}


