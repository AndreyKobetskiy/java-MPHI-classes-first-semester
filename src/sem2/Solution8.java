package sem2;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 1; i++){
            notMain();
        }
    }
    public static void notMain() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            stringArrayList.add(scanner.next()); // adding only a word not string/line
        }
        stringArrayList.remove(2); // 3rd element of list has index 2
        ListIterator<String> iterator = stringArrayList.listIterator();
        while (iterator.hasNext()) iterator.next();
        while (iterator.hasPrevious()) System.out.println(iterator.previous());
    }
}
