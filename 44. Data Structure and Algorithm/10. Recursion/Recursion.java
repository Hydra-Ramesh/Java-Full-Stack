public class Recursion {
    // Recursive function to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return n * factorial(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        int num = 5; // Change this number to test different cases
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}

