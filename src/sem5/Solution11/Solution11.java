package sem5.Solution11;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution11 {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Индекс числа " + num + ": " + findIndex(arr, num));
    }

    public static int findIndex(int[] arr, int t) {
        return IntStream.range(0, arr.length).filter(i -> arr[i] == t).findFirst().orElse(-1);
    }
}
