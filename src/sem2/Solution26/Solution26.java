package sem2.Solution26;

import java.util.HashMap;
import java.util.Map;

public class Solution26 {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }
    public static Map<String, String> createPeopleMap() {
        Map<String, String> firstLastNameTable = new HashMap<>();
        firstLastNameTable.put("First name 1", "Last name 10");
        firstLastNameTable.put("First name 1", "Last name 1");
        firstLastNameTable.put("First name 2", "Last name 2");
        firstLastNameTable.put("First name 3", "Last name 3");
        firstLastNameTable.put("First name 4", "Last name same 1");
        firstLastNameTable.put("First name 5", "Last name same 2");
        firstLastNameTable.put("First name 6", "Last name same 1");
        firstLastNameTable.put("First name 7", "Last name same 2");
        firstLastNameTable.put("First name 8", "Last name 8");
        firstLastNameTable.put("First name 9", "Last name same 1");
        return firstLastNameTable;
    }
    public static void printMap(Map<String, String> map){
        for (String key: map.keySet()) System.out.println(key + " : " + map.get(key));
    }
    public static void printPeopleMap(Map<String, String> map) {
        printMap(map);
    }
}
