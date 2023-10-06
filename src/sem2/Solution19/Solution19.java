package sem2.Solution19;

import java.util.HashMap;
import java.util.Map;

public class Solution19 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Simk", "Sim");
        map.put("Tomk", "Tom");
        map.put("Arbusk", "Arbus");
        map.put("Babyk", "Baby");
        map.put("Catk", "Cat");
        map.put("Dogk", "Dog");
        map.put("Eatk", "Eat");
        map.put("Foodk", "Food");
        map.put("Geveyk", "Gevey");
        map.put("Hugsk", "Hugs");
        printKeys(map);
        printValues(map);
    }
    public static void printKeys(Map<String, String> map) {
        for (String s: map.keySet()) System.out.println(s);
    }
    public static void printValues(Map<String, String> map) {
        for (String s: map.values()) System.out.println(s);
    }
}
