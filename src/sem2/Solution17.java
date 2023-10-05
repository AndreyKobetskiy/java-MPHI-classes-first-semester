package sem2;

import java.util.HashSet;

public class Solution17 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("арбуз");
        hashSet.add("банан");
        hashSet.add("вишня");
        hashSet.add("груша");
        hashSet.add("дыня");
        hashSet.add("ежевика");
        hashSet.add("женьшень");
        hashSet.add("земляника");
        hashSet.add("ирис");
        hashSet.add("картофель");

        for (String s: hashSet) System.out.println(s);
    }
}
