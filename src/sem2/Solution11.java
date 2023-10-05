package sem2;

import java.util.ArrayList;

public class Solution11 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);
        for (String string : strings) {
            System.out.println(string);
        }
    }
    public static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList<String> result = new ArrayList<>();
        for (String string: strings){
            if (string.contains("л")) result.add(string);
            if (!string.contains("р")) result.add(string);
        }
        return result;
    }
}
