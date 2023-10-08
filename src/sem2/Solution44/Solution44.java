package sem2.Solution44;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution44 {
    public static void main(String[] args) {
        readData();
    }
    public static void readData() {
        List<Integer> inputtedData = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true){
                inputtedData.add(Integer.parseInt(reader.readLine()));
            }
        } catch (Exception e){          //NumberFormatException
            for (Integer i : inputtedData) System.out.println(i);
            //System.out.println(e);
        }
    }
}
