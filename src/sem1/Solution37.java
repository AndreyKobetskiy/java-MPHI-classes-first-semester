package sem1;

import java.util.Scanner;

public class Solution37 {
    public static void check(int x, int y){
        if (x > 0 && y > 0){
            System.out.println(1);
        } else if (x < 0 && y > 0) {
            System.out.println(2);
        } else if (x < 0 && y < 0) {
            System.out.println(3);
        } else if (x > 0 && y < 0) {
            System.out.println(4);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        do {
            check(x, y);
            x = scanner.nextInt();
            y = scanner.nextInt();
        } while (x != 0 && y != 0);

    }
}
