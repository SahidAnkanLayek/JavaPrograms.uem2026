class Calculator  {
    // Method with one integer parameter
    public int add(int a) {
        return a + a;
    }

    // Method with two integer parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add one int: " + calc.add(10));
        System.out.println("Add two ints: " + calc.add(10, 20));
        System.out.println("Add two doubles: " + calc.add(10.5, 20.5));
    }
}
