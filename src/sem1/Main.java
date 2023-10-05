package sem1;

public class Main {
    private static final double PI = 3.141;

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.print("PI=");
        System.out.println(getPi());
        int a = 1, b = 2;
        boolean cmp = a > b;
        if (cmp){
            System.out.print(">");
        } else if (a == 2) {
            System.out.print(">2");
        }else { System.out.print("else");}


    }
    public static double getPi(){return PI;}
}
