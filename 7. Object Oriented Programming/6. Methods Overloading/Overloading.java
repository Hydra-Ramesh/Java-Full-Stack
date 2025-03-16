class Calculator{
    public int add(int num1, int num2)
    {
        return num1 + num2;
    }
    public int add(int num1, int num2, int num3)
    {
        return num1 + num2 + num3;
    }
}
public class Overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));
        System.out.println(calc.add(5, 10, 15));
    }
}
