public class TypeConversion {
    public static void main(String[] args) {
        int intNum = 100;
        long longNum = intNum; // int to long
        float floatNum = longNum; // long to float
        double doubleNum = floatNum; // float to double

        System.out.println("int to long: " + longNum);
        System.out.println("long to float: " + floatNum);
        System.out.println("float to double: " + doubleNum);
    }
}

