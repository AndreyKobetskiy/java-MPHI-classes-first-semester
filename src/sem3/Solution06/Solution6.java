package sem3.Solution06;

import java.util.ArrayList;

public class Solution6 {
        public static void main(String[] args) {
            ArrayList<String>[] arrayOfStringList = createList();
            printList(arrayOfStringList);
        }
        public static ArrayList<String>[] createList() {
            ArrayList<String>[] data = new ArrayList[3];
            ArrayList<String> l1 = new ArrayList<>();
            ArrayList<String> l2 = new ArrayList<>();
            ArrayList<String> l3 = new ArrayList<>();
            l1.add("qwerty");
            l1.add("uwu");
            l2.add(":-:  :-:");
            l3.add("edc");
            l3.add("qaz");
            l3.add("wsx");
            data[0] = l1;
            data[1] = l2;
            data[2] = l3;
            return data;
        }
        public static void printList(ArrayList<String>[] arrayOfStringList) {
            for (ArrayList<String> list : arrayOfStringList) {
                for (String s : list) {
                    System.out.println(s);
                }
            }
        }
}
