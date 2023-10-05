package sem1;

import java.util.Scanner;

public class Solution34 {
    public static void checkSides(int a, int b, int c){
        if (a + b > c && b + c > a && c + a > b){
            System.out.println("Треугольник существует.");
        }
        else {
            System.out.println("Треугольник не существует.");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        do {
            checkSides(a, b ,c);
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
        } while (a != -1);


    }
}
