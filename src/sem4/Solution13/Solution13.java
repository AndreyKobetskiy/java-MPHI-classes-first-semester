package sem4.Solution13;

import java.io.*;

public class Solution13 {
    // src/sem4/Solution13/output.txt
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        String s;
        while (!(s = reader.readLine()).equals("exit")){
            writer.write(s + "\n");
        }
        writer.close();

    }
}
