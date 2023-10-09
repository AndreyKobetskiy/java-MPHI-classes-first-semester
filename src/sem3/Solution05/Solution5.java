package sem3.Solution05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Solution5 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new
                InputStreamReader(System.in));
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');
        int[] counters = new int[alphabet.size()];
        for (Character c : reader.readLine().toCharArray()){
            for (int i = 0; i < alphabet.size(); i++){
                if (c.equals(alphabet.get(i))){
                    counters[i]++;
                }
            }
        }
        for (int i : counters) System.out.println(i);
    }
}
