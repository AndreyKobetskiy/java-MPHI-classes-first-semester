package sem1;

import java.util.*;
import java.util.stream.Collectors;

public class Solution0L21 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            doSort(scanner);
        }
    }

    private static void doSort(Scanner scanner) {
        List<Integer> integerList;
        List<String> strList = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));
        integerList = strList.stream().map(Integer::valueOf).collect(Collectors.toList());
        Collections.sort(integerList);
        for (Integer el: integerList){
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
