package sem5.Solution10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution10 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Пиро");
        map.put(2, "Гидро");
        map.put(3, "Анемо");
        System.out.println("Map: " + map);
        Stream<Map.Entry<Integer, String>> stream = mapToStream(map);
        System.out.println("Stream: " + Arrays.toString(stream.toArray()));
    }
    public static <K, V> Stream<Map.Entry<K, V>> mapToStream(Map<K, V> map) {
        return map.entrySet().stream();
    }
}
