package sem4.Solution12;

import java.io.*;

public class Solution12 {
    // src/sem4/Solution12/song.txt
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());
        BufferedReader fileReader = new BufferedReader( new FileReader(file));
        String s;
        while ((s = fileReader.readLine()) != null){
            System.out.println(s);
        }

    }
}
