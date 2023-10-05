package sem2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution27 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        sort(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }
    public static void sort(int[] array) {
        stoogeSort(array, 0, array.length-1);
    }
    public static void stoogeSort(int[] array, int left, int right){
        if (array[left] < array[right]){
            int tepm = array[left];
            array[left] = array[right];
            array[right] = tepm;
        }
        if ( (right - left + 1) > 2 ){
            int t = (right - left + 1) / 3;
            stoogeSort(array, left, right - t);
            stoogeSort(array, left + t, right);
            stoogeSort(array, left, right - t);
        }
    }
}
