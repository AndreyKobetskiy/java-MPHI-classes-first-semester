package sem2.Solution34;

public class Solution34 {
    public static void main(String[] args) {
        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch (final ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

    }
}
