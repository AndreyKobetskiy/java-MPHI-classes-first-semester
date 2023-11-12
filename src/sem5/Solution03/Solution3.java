package sem5.Solution03;

import java.util.stream.Stream;

public class Solution3 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Первый", "Элемент", "В", "Данном",
                "Потоке");
        System.out.println("Последний элемент: " + lastElement(stream));
    }
    public static String lastElement(Stream<String> stream) {
        return stream.reduce((s1, s2) -> s2).orElse(null);
    }
}
