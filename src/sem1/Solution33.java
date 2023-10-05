package sem1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution33 {
    public static void check_year(int a){
        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)){
            System.out.println("количество дней в году: 366");
        }
        else {
            System.out.println("количество дней в году: 365");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        do {
            check_year(a);
            a = scanner.nextInt();
        } while (a != -1);


    }
}
