package sem1;

public class Solution30 {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }
    public static void displayClosestToTen(int a, int b) {
        System.out.println((abs(10 - a) > abs(10 - b) ? b : a));
    }
    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
