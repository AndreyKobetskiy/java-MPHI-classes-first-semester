package sem5.Solution02;

import java.util.stream.Stream;

public class Solution2 {
    public static void main(String[] args) {
        Stream<String> streamR = Stream.of("Первый", "Элемент", "В", "Данном",
                "Потоке");
        Stream<Integer> streamF = Stream.of(1, 2, 3, 4, 5, 6, 7);
        System.out.println("Первый элемент: " + firstElement(streamR));
        System.out.println("Первый элемент: " + firstElement(streamF));
    }

    public static <T> T firstElement(Stream<T> stream) {
        return stream.findFirst().orElse(null);
    }
}

