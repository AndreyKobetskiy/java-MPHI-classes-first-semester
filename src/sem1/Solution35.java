package sem1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution35 {
    public static void checkCaller(int simpleTime){
        if (simpleTime % 5 < 3){
            System.out.println("зелёный");
        } else if (simpleTime % 5 < 4) {
            System.out.println("жёлтый");
        } else {
            System.out.println("красный");
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double realTime = Double.parseDouble(reader.readLine());
        int simpleTime = (int) realTime;
        do {
            checkCaller(simpleTime);
            realTime = Double.parseDouble(reader.readLine());
            simpleTime = (int) realTime;
        } while (simpleTime != -1);

        //System.out.println(simpleTime);
    }
}
