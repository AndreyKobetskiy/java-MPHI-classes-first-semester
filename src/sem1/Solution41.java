package sem1;

import java.util.Scanner;

public class Solution41 {
    public static boolean checkNumber(int checked, int num1, int num2){
        return (checked != num1 && checked != num2 && num1 == num2);
    }
    public static void printNeeded(int x, int y, int z){
        if (Solution41.checkNumber(x, y, z)){
            System.out.println(1);
        } else if (Solution41.checkNumber(y, x, z)) {
            System.out.println(2);
        } else if (Solution41.checkNumber(z, y, x)) {
            System.out.println(3);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        do {
            printNeeded(x, y, z);
            x = scanner.nextInt();
            y = scanner.nextInt();
            z = scanner.nextInt();
        } while (!(x == y && y == z));

    }
}
