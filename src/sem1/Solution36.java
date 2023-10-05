package sem1;

import java.util.Scanner;

public class Solution36 {
    public static void check(int a, int b, int c){
        if (a == b && b == c){
            System.out.println(a + " " + b + " " + c);
        } else if (a == b) {
            System.out.println(a + " " + b);
        } else if (a == c) {
            System.out.println(a + " " + c);
        } else if (c == b) {
            System.out.println(c + " " + b);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        do {
            check(a, b, c);
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
        } while (a != -1);
        check(a, b, c);


    }
}
