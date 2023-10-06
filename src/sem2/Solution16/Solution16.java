package sem2.Solution16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution16 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }
        ArrayList<String> resultStrings = new ArrayList<>();
        resultStrings = multiply(strings);
        for (String s: resultStrings){
            System.out.println(s);
        }
    }

    public static ArrayList<String> multiply(ArrayList<String> strings){
        ArrayList<String> result = new ArrayList<>();

        for (String s: strings){
            result.add(s);
            result.add(s);
            if (s.length() % 2 == 1){
                result.add(s);
            }
        }
        return result;
    }

}
