package sem1;

public class Solution23 {
    public static int min(int a, int b, int c, int d) {
        return min(min(a, b), min(c, d));
    }
    public static int min(int a, int b) {
        return (a > b ? b : a);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
