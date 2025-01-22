class FactorialClass {
    public int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}

public class FactorialUsingClass {
    public static void main(String[] args) {
        int num = 5; // Declaring the number
        FactorialClass factorialClass = new FactorialClass();
        int result = factorialClass.factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
