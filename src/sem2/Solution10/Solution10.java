package sem2.Solution10;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 1; i++){
            notMain();
        }
    }
    public static void notMain(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list.add(scanner.next()); // adding only a word not string/line
        }
        ArrayList<String> result = doubleValues(list);
        for (String s: result){ System.out.println(s); }
    }
    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();
        for (String s: list){
            result.add(s);
            result.add(s);
        }
        return result;
    }

}
