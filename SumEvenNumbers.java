public class SumEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        
        // Find the sum of even numbers
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        
        System.out.println("Sum of even numbers: " + sum);
    }
}
