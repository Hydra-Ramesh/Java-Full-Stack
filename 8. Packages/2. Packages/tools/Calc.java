package tools;
public class Calc extends AdvanceCalc{

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.add(10, 20));
        System.out.println(c.sub(10, 20));
        System.out.println(c.mul(10, 20));
        System.out.println(c.div(10, 20));
    }
}