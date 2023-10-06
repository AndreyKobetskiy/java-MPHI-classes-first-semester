package sem2.Solution20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;


public class Solution20 {
    public static void main(String[] args) {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        System.out.println("arrayList - ok; size: " + arrayList.size());
        get10000(arrayList);
        System.out.println("arrayList - ok; size: " + arrayList.size());
        set10000(arrayList);
        System.out.println("arrayList - ok; size: " + arrayList.size());
        remove10000(arrayList);
        System.out.println("arrayList - ok; size: " + arrayList.size());
        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        System.out.println("linkedList - ok; size: " + linkedList.size());
        get10000(linkedList);
        System.out.println("linkedList - ok; size: " + linkedList.size());
        set10000(linkedList);
        System.out.println("linkedList - ok; size: " + linkedList.size());
        remove10000(linkedList);
        System.out.println("linkedList - ok; size: " + linkedList.size());
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) list.add(i);
    }

    public static void get10000(List list) {
        for (int i = 0; i < 10000; i++) list.get(i);
    }

    public static void set10000(List list) {
        for (int i = 0; i < 10000; i++) list.set(i, 0);
    }

    public static void remove10000(List list) {
        for (int i = 0; i < 10000; i++) list.remove(0);
    }
}
