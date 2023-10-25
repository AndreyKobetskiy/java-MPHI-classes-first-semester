package sem4.Solution5;

public class Solution5 {
    public static long min(long l1, long l2){
        return Math.min(l1, l2);
    }
    public static int min(int i1, int i2){
        return (int) min((long)i1, (long)i2);
    }
    public static double min(double d1, double d2){
        return (d1 > d2 ? d2 : d1);
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2));
        System.out.println(min(1L, 2L));
        System.out.println(min(1.0, 2.0));
    }
}
