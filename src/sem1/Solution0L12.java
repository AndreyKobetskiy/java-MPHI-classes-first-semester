package sem1;

import java.util.Scanner;

public class Solution0L12 {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sm = 0;
        int num = 0;
        while (a != -1){
            sm += a;
            num++;
            a = scanner.nextInt();
        }
        System.out.println((double) sm / num);
    }
}
