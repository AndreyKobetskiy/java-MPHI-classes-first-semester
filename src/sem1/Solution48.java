package sem1;

public class Solution48 {
    public static void main(String[] args) {

        System.out.println(sumDigitsInNumber(546));
        System.out.println(sumDigitsInNumber(100));
        System.out.println(sumDigitsInNumber(222));
    }
    public static int sumDigitsInNumber(int number) {
        return (number % 10) + (number / 10) % 10 + (number / 100) % 10;
    }
}