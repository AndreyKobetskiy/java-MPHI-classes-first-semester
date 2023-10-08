package sem2.Solution45;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution45 {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        for (int i =0; i < 3; i++){
            notMain();
        }
    }
    public static void notMain() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder vowels = new StringBuilder();
        StringBuilder others = new StringBuilder();
        char space = ' ';
        char[] inputString = reader.readLine().toCharArray();
        for (char c : inputString){
            if (isVowel(c)){
                vowels.append(c).append(" ");
            }else if (c != space){
                others.append(c).append(" ");
            }
        }
        System.out.println(vowels);
        System.out.println(others);
    }
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        for (char d : vowels) {
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}
