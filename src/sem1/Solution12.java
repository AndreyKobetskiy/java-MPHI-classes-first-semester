package sem1;

public class Solution12 {
    public static void main(String[] args) {
        hackScholarShip(1882);
        hackScholarShip(2000);
        hackScholarShip(0);
    }
    public static void hackScholarShip(int a) {
        a += 50;
        System.out.println("«Ваша стипендия составляет: "+ a +" рублей вмесяц.»");

    }
}
