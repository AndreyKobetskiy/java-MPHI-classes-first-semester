package sem2.Solution42;

public class Solution42 {
    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static int divideByZero() {
        return 1 / 0;
    }
}
