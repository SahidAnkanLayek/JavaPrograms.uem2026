// Implementation of Returning a Value from the Caller Method

public class ReturnValue {
    
    // Method that returns an integer value
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        ReturnValue obj = new ReturnValue();
        int result = obj.add(10, 20);
        System.out.println("Sum is: " + result);
    }
}
