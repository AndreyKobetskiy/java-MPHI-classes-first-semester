package sem1;

import java.util.Scanner;

public class Solution38_39 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        //System.out.println("max: " + (y > x ? y : x));
        System.out.println("min: " + (y < x ? y : x));
        //System.out.println(a + " " + b + " " + c);
    }
}
