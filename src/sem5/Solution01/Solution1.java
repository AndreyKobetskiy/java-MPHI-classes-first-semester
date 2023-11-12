package sem5.Solution01;

import java.util.stream.Stream;

public class Solution1 {
    public static void main(String[] args) {
        Stream<String> streamR = Stream.of("Первый", "Элемент", "В", "Данном",
                "Потоке");
        Stream<String> streamF = Stream.of("Другой", "Первый", "Элемент", "В", "Потоке");
        System.out.println("Первый элемент: " + firstElementByReduce(streamR));
        System.out.println("Первый элемент: " + firstElementByFindFirst(streamF));
    }
    public static String firstElementByReduce(Stream<String> stream) {
        return stream.reduce((s1, s2) -> s1).orElse("Empty");
    }
    public static String firstElementByFindFirst(Stream<String> stream) {
        return stream.findFirst().orElse("Empty");
    }
}
