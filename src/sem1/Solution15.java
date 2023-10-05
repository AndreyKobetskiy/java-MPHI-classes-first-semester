package sem1;

public class Solution15 {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
        System.out.println(convertCelsiusToFahrenheit(100));
        System.out.println(convertCelsiusToFahrenheit(0));
    }
    public static double convertCelsiusToFahrenheit(int celsius) {
        return ((double) 9 / 5)  * celsius + 32;
    }
}
