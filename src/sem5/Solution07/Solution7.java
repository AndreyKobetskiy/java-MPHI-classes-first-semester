package sem5.Solution07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Solution7 {
    public static void main(String[] args){
        String str;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            str = reader.readLine().split(" ")[0];
        }catch (IOException e){
            str = "";
        }

        List<Character> chars = convertStrToCharList(str);
        System.out.println(chars);
    }
    public static List<Character> convertStrToCharList(String str) {
        return str.chars().mapToObj(c -> (char)c).toList();
    }
}
