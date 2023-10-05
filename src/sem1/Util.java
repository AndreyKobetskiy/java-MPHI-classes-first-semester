package sem1;

public class Util {
    public static double getDistance(final int x1, final int y1, final int x2, final int y2) {
        return Math.sqrt((double) (x1 - x2) * (double) (x1 - x2) + (double) (y1 - y2) * (double) (y1 - y2));
    }
    public static void main(final String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
        System.out.println(getDistance(2, 6, 5, 10));
    }
}