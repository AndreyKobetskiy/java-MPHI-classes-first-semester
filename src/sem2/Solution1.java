package sem2;

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/

import java.io.IOException;
import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) throws Exception  {
        for (int i = 0; i < 3; i++){
            notMain(args);
        }
    }
    public static void notMain(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int max(int[] array) {
        int m = array[array.length - 1];
        for (int j : array) {
            m = Math.max(m, j);
        }
        return m;
    }
}
