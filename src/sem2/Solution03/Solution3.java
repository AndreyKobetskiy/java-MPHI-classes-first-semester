package sem2.Solution03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution3 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 2; i++){
            notMain(args);
        }
    }
    public static void notMain(String[] args) throws IOException {
        String[] strings = new String[10];
        int[] ints = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < strings.length; i++){
            strings[i] = reader.readLine();
            ints[i] = strings[i].length();
        }
        for (int i : ints){
            System.out.println(i);
        }
    }
}
