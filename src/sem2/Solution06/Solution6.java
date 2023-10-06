package sem2.Solution06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution6 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        sort(array);
        for (int x : array) {
            System.out.println(x);
        }
    }
    public static void sort(int[] array) {
        int pos = 0;
        int temp;
        while (pos < array.length){
            if (pos == 0 || array[pos] >= array[pos-1]){ pos++; }
            else {
                temp = array[pos];
                array[pos] = array[pos - 1];
                array[pos - 1] = temp;
                pos--;
            }
        }
    }
}
