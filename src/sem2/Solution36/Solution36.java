package sem2.Solution36;

import java.util.HashMap;

public class Solution36 {
    public static void main(String[] args) {
        try {
            HashMap map = new HashMap(null);
            map.put(null, null); map.remove(null);
        } catch (final NullPointerException e){
            System.out.println(e);
        }

    }
}
