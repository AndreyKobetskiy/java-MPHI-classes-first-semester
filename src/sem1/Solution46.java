package sem1;

import java.util.Scanner;

public class Solution46 {
    public static void draw(Scanner scanner){
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(8);
            }
            System.out.print("\n");
        }
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3; i++ ){
            draw(scanner);
        }



    }
}
