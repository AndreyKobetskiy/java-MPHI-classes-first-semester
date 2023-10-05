package sem2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution25 {
    public static Map<String, String> createMap() {
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
        firstLastNameTable.put("First name 9", "Last name 9");
        firstLastNameTable.put("First name 10", "Last name same 1");


        return firstLastNameTable;
    }
    public static int getCountTheSameFirstName(Map<String, String> firstLastNameTable, String name) {

        int ans = 0;
        for(String lastName: firstLastNameTable.keySet()){
            if (lastName.equals(name)) ans++;
        }
        return ans;
    }

    public static int getCountTheSameLastName(Map<String, String> firstLastNameTable, String neededLastName) {
        int ans = 0;
        for(String lastName: firstLastNameTable.keySet()){
            if (firstLastNameTable.get(lastName).equals(neededLastName))
                ans++;
        }
        return ans;
    }
    public static void removeTheFirstNameDuplicates(Map<String, String> firstLastNameTable) {
        Set<String> uniqueNames = new HashSet<>();
        Set<String> keysCopy = new HashSet<>(firstLastNameTable.keySet());
        for (String lastName: keysCopy){
            if (!uniqueNames.add(firstLastNameTable.get(lastName))){
                removeItemFromMapByValue(firstLastNameTable, firstLastNameTable.get(lastName));
            }
        }
    }
    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }
    public static void printMap(Map<String, String> map){
        for (String key: map.keySet()) System.out.println(key + " : " + map.get(key));
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println("After initialization:");
        printMap(map);
        System.out.println("Same first name: " + getCountTheSameFirstName(map, "First name 1"));
        System.out.println("Same last name: " + getCountTheSameLastName(map, "Last name same 1"));
        removeTheFirstNameDuplicates(map);
        System.out.println("After deletions:");
        printMap(map);
    }
}
