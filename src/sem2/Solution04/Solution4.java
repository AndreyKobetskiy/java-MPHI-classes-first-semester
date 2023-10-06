package sem2.Solution04;

import java.io.IOException;
import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 2; i++){
            notMain(args);
        }
    }
    public static void notMain(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] houses = new int[15];
        int oddSum = 0, evenSum = 0;
        for (int i = 0; i < houses.length; i++){
            houses[i] = scanner.nextInt();
            if (i % 2 == 0){
                evenSum += houses[i];
            } else {
                oddSum += houses[i];
            }
        }
        if (oddSum >= evenSum){
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с четными номерами проживает больше жителей");
        }

    }
}
