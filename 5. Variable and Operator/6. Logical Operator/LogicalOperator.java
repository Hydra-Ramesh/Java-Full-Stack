public class LogicalOperator {
    public static void main(String[] args) {
        boolean A = true, B = false;

        // Logical AND
        System.out.println("A && B: " + (A && B)); // false

        // Logical OR
        System.out.println("A || B: " + (A || B)); // true

        // Logical NOT
        System.out.println("!A: " + (!A)); // false
        System.out.println("!B: " + (!B)); // true
    }
}
