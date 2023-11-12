package sem5.Solution04;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Set;
public class Solution4 {
    public static <T> Set<T> findDuplicate(Stream<T> stream) {
        return stream.collect(Collectors.toSet());
    }
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(5, 13, 4,
                                           21, 13, 27,
                                           2, 59, 59, 34);
        System.out.println(findDuplicate(stream));
    }
}
