package sem1;

public class Cat27 {
    private static int catsCount = 0;
    public static void setCatsCount(int catsCount) {
        Cat27.catsCount = catsCount;
    }
    public static void main(String[] args) {
        Cat27.setCatsCount(101);
        System.out.println(Cat27.catsCount);
    }
}
