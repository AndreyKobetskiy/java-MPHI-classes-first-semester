package sem5.Solution05;

import java.util.Scanner;
import java.util.stream.Stream;

public class Solution5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char ch = scanner.next().charAt(0);

        System.out.println(count(str, ch));
    }
    public static long count(String s, char ch) {
        return s.chars().filter(i -> i == ch).count();
    }
}
