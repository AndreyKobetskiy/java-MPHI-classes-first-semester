package sem1;

public class Cat0L16 {
    public static int getCatCount() {
        return catCount;
    }

    public static void setCatCount(int catCount) {
        Cat0L16.catCount = catCount;
    }

    private static int catCount = 0;
    public Cat0L16() {
        catCount++;
    }


    public static void main(final String[] args) {
        setCatCount(15);
        System.out.println(getCatCount());
        Cat0L16 cat0L16 = new Cat0L16();
        System.out.println(getCatCount());
        setCatCount(500);
        System.out.println(getCatCount());


    }
}
