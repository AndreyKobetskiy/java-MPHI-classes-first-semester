package sem2.Solution05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution5 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 3; i++){
            notMain();
        }
    }
    public static void notMain() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringArrayList = new ArrayList<>();
        int maxLength = 0;
        ArrayList<String> longestStrings = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            stringArrayList.add(reader.readLine());
        }
        for (String s: stringArrayList){
            if (s.length() > maxLength){
                maxLength = s.length();
                longestStrings.clear();
                longestStrings.add(s);
            } else if (s.length() == maxLength){
                longestStrings.add(s);
            }
        }
        for (String s: longestStrings){
            System.out.println(s);
        }
    }
}
