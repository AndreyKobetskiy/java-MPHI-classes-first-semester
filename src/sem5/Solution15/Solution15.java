package sem5.Solution15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution15 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sentence = "";
        StringBuilder sentenceBuilder = new StringBuilder();
        String input;

        while ((input = reader.readLine()) != null && !input.isEmpty()) {
            if (input.contains(".") || input.contains("?") || input.contains("!")) {
                sentenceBuilder.append(sentenceEnding(input));
                sentenceBuilder.append(" ");
                break;
            } else sentenceBuilder.append(input);
            sentenceBuilder.append(" ");
        }
        sentence = sentenceBuilder.delete(sentenceBuilder.length()-1, sentenceBuilder.length()).toString();
        System.out.println(sentence);
        List<Integer> lenths = wordsLength(sentence);
        System.out.println(lenths);


    }
    private static String sentenceEnding(String string){
        String endPoint = null;
        String endExcl = null;
        String endQw = null;
        if (string.contains(".")) endPoint = string.split("\\.")[0] + ".";
        if (string.contains("?")) endQw = string.split("\\?")[0] + "?";
        if (string.contains("!")) endExcl = string.split("!")[0] + "!";
        return Stream.of(endPoint, endQw, endExcl).filter(Objects::nonNull)
                .min(Comparator.comparingInt(String::length)).orElse("");
    }
    private static List<Integer> wordsLength(String sentence){
        return Arrays.stream(sentence.split("\\W+")).map(String::length).collect(Collectors.toList());
    }
}
