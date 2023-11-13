package sem5.Solution12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Solution12 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((123 * i + 17) % 23);
        }
        Scanner scanner = new Scanner(System.in);
        int stInd = scanner.nextInt();
        int endInd = scanner.nextInt();
        Stream<Integer> intStream = list.stream();
        System.out.println("List: " + list);
        Stream<Integer> sliceOfIntStream = getSlice(intStream, stInd, endInd);
        System.out.println("Stream:");
        sliceOfIntStream.forEach(System.out::println);
    }
    public static <T> Stream<T> getSlice(Stream<T> stream, int stInd, int endInd) {
        return stream.skip(stInd).limit(endInd - stInd);
    }
}
