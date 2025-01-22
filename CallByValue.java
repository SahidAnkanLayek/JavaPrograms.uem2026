public class CallByValue {
    
    // Method that demonstrates call by value
    public void changeValue(int num) {
        num = 10;  // Changing the value of num
    }

    public static void main(String[] args) {
        CallByValue obj = new CallByValue();
        int value = 5;
        obj.changeValue(value);  // Pass by value
        System.out.println("Value after method call: " + value);  // Original value remains unchanged
    }
}
