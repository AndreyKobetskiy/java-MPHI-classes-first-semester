package sem2.Solution24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution24 {
    public static void main(String[] args) {
        notMain();
        notMain();
    }

    public static void notMain(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }
        int ans = 0;
        int counter = 1;
        int previous = list.get(0);
        for (int i = 1; i < 10; i++) {
            if (list.get(i) == previous) counter++;
            else {
                ans = Math.max(ans, counter);
                counter = 1;
            }
            previous = list.get(i);

        }
        System.out.println(ans);
    }
}
