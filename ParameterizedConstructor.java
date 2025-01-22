public class ParameterizedConstructor {
    int a, b;
    
    // Parameterized constructor
    public ParameterizedConstructor(int x, int y) {
        a = x;
        b = y;
        System.out.println("Sum of a and b: " + (a + b));
    }

    public static void main(String[] args) {
        // Creating an object with parameters
        ParameterizedConstructor obj = new ParameterizedConstructor(5, 10);
    }
}
