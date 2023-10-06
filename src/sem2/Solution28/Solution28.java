package sem2.Solution28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution28 {
    // with arrayList O(n) + O(nlogn) = O(nlogn)
    // with treeSet O(n) * O(logn) = O(nlogn)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) list.add(scanner.next());
        Collections.sort(list);
        for (String word: list) System.out.println(word);
    }

}
