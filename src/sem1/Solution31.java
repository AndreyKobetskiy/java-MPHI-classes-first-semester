package sem1;

public class Solution31 {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }
    public static void checkInterval(int a) {
        System.out.println( (a < 100 && a > 50) ?
                "Число а содержится в интервале." : "Число а не содержится в интервале.");
    }
}
