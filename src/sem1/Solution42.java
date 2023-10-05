package sem1;

import java.util.Scanner;

public class Solution42 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            if (x >= y){
                if (y >= z){
                    System.out.println(x + " " + y + " " + z);
                } else if (x >= z) {
                    System.out.println(x + " " + z + " " + y);
                } else {
                    System.out.println(z + " " + x + " " + y);
                }
            } else { // x < y
                if (x >= z){
                    System.out.println(y + " " + x + " " + z);
                } else if (y >= z) { //x < z
                    System.out.println(y + " " + z + " " + x);
                } else {
                    System.out.println(z + " " + y + " " + x);
                }
            }
        }
    }
}
