package sem1;

import java.util.Scanner;

public class Solution43 {
    public static void xcount(Scanner scanner){
        int p = 0, o = 0, n;
        for (int i = 0; i < 3; i++){
            n = scanner.nextInt();
            if (n > 0){
                p ++;
            } else if (n < 0) {
                o ++;
            }
        }
        System.out.println("количество отрицательных чисел: " + o +"\nколичество положительных чисел: " + p);
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            xcount(scanner);
        }
    }
}
