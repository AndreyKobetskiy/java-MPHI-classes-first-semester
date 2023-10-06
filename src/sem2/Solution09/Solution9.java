package sem2.Solution09;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution9 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 1; i++){
            notMain();
        }
    }
    public static void notMain() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            stringArrayList.add(scanner.next()); // adding only a word not string/line
        }
        for (int i = 1; i < stringArrayList.size(); i++){
            if (stringArrayList.get(i-1).length() > stringArrayList.get(i).length() ){
                System.out.println(i);
                return;
            }
        }
    }
}
