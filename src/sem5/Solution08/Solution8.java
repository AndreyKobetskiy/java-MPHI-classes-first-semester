package sem5.Solution08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution8 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Изначальный массив: " + Arrays.toString(arr));
        int index;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            index = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            index = -1;
        }
        arr = removeElem(arr, index);
        System.out.println("Итоговый массив: " + Arrays.toString(arr));
    }
    public static int[] removeElem(int[] arr, int index) {
        if (index <= -1 || index >= arr.length) return arr;
        return IntStream.range(0, arr.length).filter(i -> i != index).map(i -> arr[i]).toArray();
    }
}
