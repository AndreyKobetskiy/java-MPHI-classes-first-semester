package sem5.Solution14;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution14 {
    public static void main(String[] args) {
        final Collector<Integer, ?, Map<Integer, Integer>> collector =
                Collectors.toMap(i -> i,
                                 i -> i*i,
                                (i1, i2) -> i1);
        Map<Integer, Integer> sq = tenRandomInts(500).collect(collector);
        System.out.println(sq);
    }
    private static Stream<Integer> tenRandomInts(int bound){
        Random random = new Random();
        int[] ints = new int[10];
        for (int i = 0; i < 10; i++) {
            ints[i] = random.nextInt(bound);
        }
        return Arrays.stream(ints).boxed();
    }
}
