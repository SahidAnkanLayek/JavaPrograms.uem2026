public class FactorialMethod {
    public static void main(String[] args) {
        int num = 5; // Declaring the number
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
    
    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
