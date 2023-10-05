package sem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Solution7 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 1; i++){
            notMain();
        }
    }
    public static void notMain() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<String> stringLinkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++){
            stringLinkedList.add(reader.readLine());
        }
        for (int i = 0; i < 13; i++){
            stringLinkedList.addFirst(stringLinkedList.removeLast());
        }
        for (String s : stringLinkedList) {
            System.out.println(s);
        }
    }
}
