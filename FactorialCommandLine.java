public class FactorialCommandLine {
    public static void main(String[] args) {
        // Check if a command-line argument is provided
        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return; // Exit the program if no input is provided
        }

        try {
            // Parse the command-line argument into an integer
            int num = Integer.parseInt(args[0]);
            int factorial = 1;

            // Calculate factorial
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            // Print the factorial
            System.out.println("Factorial of " + num + " is: " + factorial);
        } catch (NumberFormatException e) {
            // Handle invalid input (non-integer values)
            System.out.println("Invalid input. Please provide a valid integer.");
        }
    }
}

