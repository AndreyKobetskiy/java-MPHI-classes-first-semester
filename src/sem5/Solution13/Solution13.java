package sem5.Solution13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Solution13 {
    public static void main(String[] args) {
        ArrayList<String> list = randomStringArrayList();
        System.out.println(list);
        System.out.println(shortestWordWithLengthMoreThan4(list));
    }

    private static String shortestWordWithLengthMoreThan4(List<String> list){
        return list.stream().filter(s -> s.length() > 4)
                .min(Comparator.comparingInt(String::length)).orElse("No such words");
    }

    private static ArrayList<String> randomStringArrayList(){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(randomWord());
        }
        return list;
    }

    public static String randomWord() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();
        int targetStringLength = random.nextInt(20);

        return random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }


}
