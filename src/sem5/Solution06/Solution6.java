package sem5.Solution06;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution6 {
    public static void main(String args[]) {
        Stream<Integer>
                stream = Stream.of(1, 2, 3, 4, 5);
        ArrayList<Integer> alFromStream = getAlFromStream(stream);
        System.out.println("ArrayList: " + alFromStream);
    }
    public static <T> ArrayList<T> getAlFromStream(Stream<T> stream) {
        return new ArrayList<>(stream.toList());
    }
}
