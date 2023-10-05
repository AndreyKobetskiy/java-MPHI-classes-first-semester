package sem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

public class Solution13 {
    public static void main(String[] args) throws Exception {
        notMain();
    }

    public static void notMain() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        while (!Objects.equals(input, "end")){
            list.add(input);
            input = reader.readLine();
        }
        for (String s: list) System.out.println(s);
    }
}
