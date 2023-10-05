package sem1;

public class Solution0L5 {
    public static void main(final String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }
    public static void checkSeason(final int month) {
        if ((month <= 2 && month > 0) || (month == 12)){
            System.out.println("зима");
        } else if (month <= 5 && month >= 3){
            System.out.println("весна");
        } else if (month <= 8 && month >= 6){
            System.out.println("лето");
        } else if (month <= 11 && month >= 9){
            System.out.println("осень");
        }

    }
}
