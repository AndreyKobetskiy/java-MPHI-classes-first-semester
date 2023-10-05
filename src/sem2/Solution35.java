package sem2;

import java.util.ArrayList;

public class Solution35 {
    public static void main(String[] args) {
        try {
            ArrayList list = new ArrayList();
            String s =(String) list.get(18);
        } catch (final IndexOutOfBoundsException e){
            System.out.println(e);
        }

    }
}
