package sem1;

public class Cat26 {
    private static int catsCount = 0;
    public static void addNewCat() {
        Cat26.catsCount += 1;
    }
    public static void main(String[] args) {
        Cat26.addNewCat();
        Cat26.addNewCat();
        System.out.println(Cat26.catsCount);

    }
}