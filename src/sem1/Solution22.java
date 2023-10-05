package sem1;

public class Solution22 {
    public static int min(int a, int b, int c) {
        return ((a > b ? b : a) > c ? c : (a > b ? b : a));
    }
    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
