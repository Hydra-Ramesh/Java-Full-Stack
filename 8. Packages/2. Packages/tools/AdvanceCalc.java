package tools;
public class AdvanceCalc {
    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        AdvanceCalc c = new AdvanceCalc();
        System.out.println(c.mul(10, 20));
        System.out.println(c.div(10, 20));
    }
    
}
