public class Literals {
    public static void main(String[] args) {
        // Integer literals
        int decimal = 100;
        int octal = 075;       // Octal (base 8)
        int hex = 0x2F;        // Hexadecimal (base 16)
        int binary = 0b1101;   // Binary (base 2)

        // Floating-point literals
        float piFloat = 3.14f;
        double piDouble = 3.14159;

        // Character and String literals
        char letter = 'A';
        String greeting = "Hello, Java!";

        // Boolean literals
        boolean isJavaFun = true;
        boolean isRaining = false;

        // Null literal (Used with reference types)
        String str = null;

        // Underscores in numeric literals
        int oneMillion = 1_000_000;

        // Printing to console
        System.out.println("Integer Literals:");
        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hex);
        System.out.println("Binary: " + binary);

        System.out.println("\nFloating-Point Literals:");
        System.out.println("Float: " + piFloat);
        System.out.println("Double: " + piDouble);

        System.out.println("\nCharacter and String Literals:");
        System.out.println("Character: " + letter);
        System.out.println("String: " + greeting);

        System.out.println("\nBoolean Literals:");
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is it raining? " + isRaining);

        System.out.println("\nNull Literal:");
        System.out.println("String with null value: " + str);

        System.out.println("\nUnderscore in Numeric Literals:");
        System.out.println("One Million: " + oneMillion);
    }
}
