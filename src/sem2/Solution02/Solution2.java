package sem2.Solution02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 1; i++){
            notMain(args);
        }
    }
    public static void notMain(String[] args) throws IOException {
        String[] array = initializeArray();
        printArray(array);
    }
    public static String[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[10];
        for (int i = 0; i < 8; i++){
            array[i] = reader.readLine();
        }
        return array;
    }
    public static void printArray(String[] array){
        for (int i = 9; i >= 0; i--){
            System.out.println(array[i]);
        }
    }
}
