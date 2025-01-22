public class CallByReference {
    
    // Method that demonstrates call by reference
    public void changeArray(int[] arr) {
        arr[0] = 10;  // Changing the first element of the array
    }

    public static void main(String[] args) {
        CallByReference obj = new CallByReference();
        int[] numbers = {5, 6, 7};
        obj.changeArray(numbers);  // Pass by reference
        System.out.println("First element after method call: " + numbers[0]);  // Original array is modified
    }
}
