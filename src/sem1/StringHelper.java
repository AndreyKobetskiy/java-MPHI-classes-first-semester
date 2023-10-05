package sem1;

public class StringHelper {
    public static String multiply(final String s) {
        String result = "";
        result = multiply(s, 5);
        return result;
    }
    public static String multiply(final String s, final int count) {
        return String.valueOf(s).repeat(Math.max(0, count));
    }
    public static void main(String[] args) {
        System.out.println(multiply(" Hello underworld! "));
        System.out.println(multiply(" Hello neverworld! ", 3));
    }
}