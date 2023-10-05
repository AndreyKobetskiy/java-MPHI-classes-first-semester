package sem1;

import java.util.Scanner;

public class Solution39 {
    public static int max(int a, int b, int c, int d) {
        return max(max(a, b), max(c, d));
    }
    public static int max(int a, int b) {
        return (a < b ? b : a);
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        do {
            System.out.println(max(a, b, c, d));
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            d = scanner.nextInt();
        } while (a != -1);
        System.out.println(max(a, b, c, d));
    }
}
