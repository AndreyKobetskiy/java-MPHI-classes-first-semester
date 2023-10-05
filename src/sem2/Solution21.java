package sem2;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution21 {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }
    public static long getInsertTimeInMs(List list) {
        long start = System.nanoTime();
        insert10000(list);
        return (System.nanoTime() - start) / 1000000;
    }
    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
