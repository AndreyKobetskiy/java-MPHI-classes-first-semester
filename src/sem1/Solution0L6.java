package sem1;

import java.util.Scanner;

public class Solution0L6 {
    public static void printDay(Scanner scanner){
        int a = scanner.nextInt();
        if (a <= 7 && a > 0){
        String ans = "понедельник вторник среда четверг пятница суббота воскресенье";
        System.out.println(ans.split(" ")[a-1]);
        } else {System.out.println("такого дня недели не существует");}
    }

    public static void main(final String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 9; i++){
            printDay(scanner);
        }


    }
}
