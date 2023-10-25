package sem4.Solution17;

import java.io.*;
import java.util.*;

public class Solution17 {
    // src/sem4/Solution17/input.txt
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());
        BufferedReader fileReader = new BufferedReader( new FileReader(file));
        String s;
        List<Integer> ints = new ArrayList<>();
        while ((s = fileReader.readLine()) != null){
            int t = Integer.parseInt(s);
            if (t % 2 == 0) ints.add(t);
        }
        ints.sort(Comparator.comparingInt(a -> a));
        for(int i : ints) System.out.println(i);

    }
}
